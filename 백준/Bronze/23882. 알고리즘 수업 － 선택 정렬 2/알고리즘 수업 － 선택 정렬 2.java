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

        selSort(a, n, k);
    }

    static void selSort(int[] a, int n, int k) {
        int count = 0;

        for (int i = n - 1; i > 0; i--) {
            int maxIndex = i;

            for (int j = 0; j < i; j++) {
                if (a[j] > a[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                swap(a, i, maxIndex);
                count++;

                if (count == k) {
                    printArray(a);
                    return;
                }
            }
        }

        System.out.println(-1);
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void printArray(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int num : a) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
