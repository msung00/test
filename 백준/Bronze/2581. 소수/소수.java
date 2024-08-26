import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean pN[] = new boolean[n+1];
        pN[1] = true;
        for(int i=2; i<n; i++){
            if(!pN[i])
                for(int j=i*i; j<=n; j+=i){
                    pN[j] = true;
                }
        }
        int sum=0;
        int min=0;
        for(int i=m; i<=n; i++){
            if(!pN[i]){
                if(min == 0){
                    min = i;
                }
                sum += i;
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);   
        }
    }
}