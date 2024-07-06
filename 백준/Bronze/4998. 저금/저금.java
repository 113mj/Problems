import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                String line = br.readLine();
                if (line == null || line.isEmpty()) {
                    break;
                }
                StringTokenizer st = new StringTokenizer(line);
                double N = Double.parseDouble(st.nextToken());
                double B = Double.parseDouble(st.nextToken());
                double M = Double.parseDouble(st.nextToken());

                if (N == 0 && B == 0 && M == 0) {
                    break;
                }

                f(N, B, M);
            } catch (IOException | NumberFormatException e) {
                break;
            }
        }
    }

    public static void f(double n, double b, double m) {
        int count = 0;
        while (n < m) {
            n = n + n * b / 100;
            count++;
        }
        System.out.println(count);
    }
}
