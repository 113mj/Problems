import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        int temp = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++) {
            temp = Integer.parseInt(st.nextToken());
            a = a + temp;
        }

       st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++) {
            temp = Integer.parseInt(st.nextToken());
            b = b + temp;
        }

        System.out.println(Math.max(a, b));
    }
}