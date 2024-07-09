import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = 0;
        int five = 0;
        int three = 0;

        for (five = N / 5; five >= 0; five--) {
            a = N - 5 * five;
            if (a % 3 == 0) {
                three = a / 3;
                System.out.println(three + five);
                return;
            }
        }
        System.out.println(-1);
    }
}
