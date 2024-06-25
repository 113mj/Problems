import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        f(a);
    }

    public static void f(int a) {
        int[] num = new int[10];

        while (a != 0) {
            int b = a % 10;
            num[b]++;
            a = a / 10;
        }

        num[6] = (int) Math.ceil((double) (num[6] + num[9]) / 2.0);
        num[9] = num[6];

        int large = 0;
        for (int i = 0; i < 10; i++) {
            if (large < num[i]) {
                large = num[i];
            }
        }
        System.out.println(large);
    }
}
