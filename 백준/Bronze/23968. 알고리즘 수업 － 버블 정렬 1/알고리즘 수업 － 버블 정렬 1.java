import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        bubbleSort(a, n, k);
    }

    static void bubbleSort(int[] a, int n, int k) {
        int count = 0;
        String answer = "-1";

        for (int last = n-1; last > 0; last--) {
            for (int i = 0; i < last; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;
                    if (count == k) {
                        answer = a[i] + " " + a[i + 1];
                    }
                }
            }
        }

        System.out.println(answer);
    }
}