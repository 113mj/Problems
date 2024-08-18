import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); 
        int b = Integer.parseInt(st.nextToken());  
        int c = Integer.parseInt(st.nextToken());  

        int answer = 0;
        int[] time = new int[100];  

        for (int i = 0; i < 3; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(s.nextToken());
            int end = Integer.parseInt(s.nextToken());

            for (int j = start; j < end; j++) {
                time[j]++;
            }
        }

        for (int i = 0; i < 100; i++) {
            if (time[i] == 1) {
                answer += a;
            } else if (time[i] == 2) {
                answer += 2 * b;
            } else if (time[i] == 3) {
                answer += 3 * c;
            }
        }

        System.out.println(answer);
    }
}
