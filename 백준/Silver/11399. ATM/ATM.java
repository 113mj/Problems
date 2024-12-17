import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ary = new int[N];
        int[] sum = new int[N];
        int temp = 0;
        int min = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ary);
        for (int i = 0; i < N; i++) {
            temp += ary[i];
            sum[i] = temp;
        }

        for(int i = 0; i < N; i++) {
            min += sum[i];
        }

        System.out.println(min);
    }
}