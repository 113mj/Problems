import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int D = 0;
        int P = 0;
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String a = br.readLine();

            if(a.equals("D"))
                D++;
            else if(a.equals("P"))
                P++;

            if (Math.abs(D - P) == 2) {
                break;
            }
        }

        System.out.println(D + ":" + P);
    }
}
