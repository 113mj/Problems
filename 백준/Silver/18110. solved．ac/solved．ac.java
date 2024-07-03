import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ary = new int[N];
        double sum = 0;

        for (int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ary);

        int x = (int) round(N * 0.15);
        for (int i = x; i < ary.length - x; i++) {
            sum += ary[i];
        }
        System.out.println(round(sum / (N - 2 * x)));
    }
}
