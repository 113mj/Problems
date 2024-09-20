import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st= new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int min = N - M * K;
            int max = N - (M * (K - 1) + 1);

            if (min < 0)
                System.out.println(0);
            else
                System.out.print(min + " ");
            if (max < 0)
                System.out.println(0);
            else
                System.out.print(max);
        }
}