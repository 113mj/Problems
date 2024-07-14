import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int tc = 0; tc < N; tc++) {
            int[] team = new int[3];
            st = new StringTokenizer(br.readLine());

            int sum = 0;
            boolean isPass = true;
            for (int i = 0; i < 3; i++) {
                int n = Integer.parseInt(st.nextToken());
                team[i] = n;
                sum += n;
                if (n < L) {
                    isPass = false;
                }
            }

            if (isPass && sum >= K) {
                count++;
                sb.append(team[0]).append(" ")
                  .append(team[1]).append(" ")
                  .append(team[2]).append(" ");
            }
        }

        System.out.println(count);
        System.out.println(sb.toString().trim());
    }
}
