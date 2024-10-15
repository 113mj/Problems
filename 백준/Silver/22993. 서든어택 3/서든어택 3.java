import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] player = new long[N - 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a1 = Long.parseLong(st.nextToken());
        for (int i = 0; i < N - 1; i++) {
            player[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(player);

        for (int i = 0; i < N - 1; i++) {
            if (a1 > player[i]) {
                a1 += player[i];
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}