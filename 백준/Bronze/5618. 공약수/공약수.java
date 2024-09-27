import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int gcdResult = numbers[0];
        for (int i = 1; i < n; i++) {
            gcdResult = gcd(gcdResult, numbers[i]);
        }

        for (int i = 1; i <= gcdResult; i++) {
            if (gcdResult % i == 0) {
                System.out.println(i);
            }
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
