import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            result += (number*number);
        }
        System.out.println(result%10);

    }
}