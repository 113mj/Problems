import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] tri = new int[45];

        // Generate triangular numbers
        for (int i = 1; i < 45; i++) {
            tri[i] = i * (i + 1) / 2;
        }

        // Process each test case
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            int result = func(n, tri);
            System.out.println(result);
        }
    }

    public static int func(int N, int[] a) {
        for (int j = 1; j < 45; j++) {
            for (int k = 1; k < 45; k++) {
                for (int z = 1; z < 45; z++) {
                    int sum = a[j] + a[k] + a[z];
                    if (sum == N) {
                        return 1; // N is expressible as the sum of three triangular numbers
                    }
                }
            }
        }
        return 0; // N is not expressible as the sum of three triangular numbers
    }
}
