import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int scoreA = Integer.parseInt(st.nextToken());
        int scoreB = Integer.parseInt(st.nextToken());
        int scoreC = 0;

        boolean[] aa = new boolean[10];
        boolean[] bb = new boolean[10];
        
        for (int i = 9; i >= 0; i--) {
            int score = 1 << i; 

            if (score <= scoreA) {
                scoreA -= score;
                aa[i] = true;
            }

            if (score <= scoreB) {
                scoreB -= score;
                bb[i] = true;
            }

        }
        for (int i = 0; i <= 9; i++) {
            if (aa[i] != bb[i]) {
                scoreC += 1 << i;
            }
        }
        
        sb.append(scoreC);
        System.out.println(sb.toString());
    }
}
