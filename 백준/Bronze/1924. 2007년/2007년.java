import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int answer = 0;
        
        for (int i = 0; i < M; i++) {
            answer += month[i];
        }
        answer += D-1;
        System.out.print(days[answer%7]);
    }
}