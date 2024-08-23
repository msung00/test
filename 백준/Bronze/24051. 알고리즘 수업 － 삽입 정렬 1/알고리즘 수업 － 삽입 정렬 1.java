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
        iSort(a, n, k);
    }

    static void iSort(int[] a, int n, int k) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            int newItem = a[i];
            int loc = i - 1;

            while (loc >= 0 && newItem < a[loc]) {
                a[loc + 1] = a[loc];
                loc--;
                count++;
                if (count == k) {
                    System.out.println(a[loc + 1]);
                    return;
                }
            }

            if (loc + 1 != i) {
                a[loc + 1] = newItem;
                count++;
                if (count == k) {
                    System.out.println(a[loc + 1]);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}