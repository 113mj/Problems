import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tokenizer.nextToken()); 
        int M = Integer.parseInt(tokenizer.nextToken()); 

        int[] dir = new int[N + 1]; 

        for (int i = 1; i <= N; i++) {
            dir[i] = Integer.parseInt(br.readLine()); 
        }

        int cnt = 1; 
        int res = M; 

        for (int i = 0; i < M; i++) {
            int curr = Integer.parseInt(br.readLine()); 
            cnt += curr; 

            if (cnt < N) {
                cnt += dir[cnt]; 
            }

            if (cnt >= N) { 
                res = i + 1; 
                break;
            }
        }

        System.out.println(res); 
    }
}
