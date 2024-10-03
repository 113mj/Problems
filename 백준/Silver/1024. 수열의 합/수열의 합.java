import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        while (true) {
            int min = N / L - (L - 1) / 2;

            if (min < 0 || L > 100) {
                sb.append(-1);
                break;
            }

            int sum = (min * 2 + (L - 1)) * L / 2;

            if (sum == N) {
                for (int i = 0; i < L; i++) {
                    sb.append((min + i) + " ");
                }
                break;
            }
            L++;
        }
        System.out.println(sb);
    }
}
