import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            tri(a, b, c, count);
            count++;
        }
    }

    public static void tri(int a, int b, int c, int count) {
        System.out.println("Triangle #" + count);
        if (a == -1) {
            if (b >= c) {
                System.out.println("Impossible.");
            } else {
                System.out.printf("a = %.3f%n", Math.sqrt(c * c - b * b));
            }
        } else if (b == -1) {
            if (a >= c) {
                System.out.println("Impossible.");
            } else {
                System.out.printf("b = %.3f%n", Math.sqrt(c * c - a * a));
            }
        } else if (c == -1) {
            System.out.printf("c = %.3f%n", Math.sqrt(a * a + b * b));
        }
        System.out.println();
    }
}
