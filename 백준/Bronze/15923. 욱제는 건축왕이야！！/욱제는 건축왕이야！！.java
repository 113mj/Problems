import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        String[] firstLine = br.readLine().split(" ");
        int start_x = Integer.parseInt(firstLine[0]);
        int start_y = Integer.parseInt(firstLine[1]);
        int x = start_x;
        int y = start_y;

        for (int i = 0; i < N - 1; i++) {
            String[] nextLine = br.readLine().split(" ");
            int next_x = Integer.parseInt(nextLine[0]);
            int next_y = Integer.parseInt(nextLine[1]);

            answer += Math.abs(next_x + next_y - x - y);
            x = next_x;
            y = next_y;
        }

        answer += Math.abs(x + y - start_x - start_y);
        System.out.println(answer);
    }
}
