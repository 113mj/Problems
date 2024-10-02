import java.io.*;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int answer = -1;

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a, b = 0;

                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                if (a <= b) {
                    if (answer == -1 || b < answer)
                        answer = b;
                }
            }
            System.out.println(answer);

        }
}