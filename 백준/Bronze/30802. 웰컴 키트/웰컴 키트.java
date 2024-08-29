import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] List = new int[6];
		for (int i = 0; i < 6; i++) {
			List[i] = sc.nextInt();
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = 0;
		for (int i=0; i < 6; i++) {
			n += List[i]/a;
			if (List[i]%a!= 0) {
				n++;
			}
		}
		System.out.println(n);
		System.out.println(num/b+" "+num%b);
	}
}