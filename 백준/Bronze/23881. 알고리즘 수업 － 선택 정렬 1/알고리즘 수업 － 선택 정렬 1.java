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

        int i;
        int maxIndex = 0;
        int count = 0;
        for (i = n-1; i > 0; i--) {
            maxIndex = i;

            for (int j = i-1; j >= 0; j--) {
                if (a[j] > a[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex == i) {
                continue;
            }

            count++;
            if (count == k) {
                break;
            }

            change(a, maxIndex, i);
        }

        if (count < k) {
            System.out.println(-1);
        } else {
            System.out.println(a[i] + " " + a[maxIndex]);
        }
    }

    private static void change(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}