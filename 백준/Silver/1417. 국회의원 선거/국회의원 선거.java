import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] ary = new int[N-1];
        int D = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N-1; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }

        while (true) {
            int max = 0;
            int index = -1;

            for(int i = 0; i < N-1; i++) {
                if(max < ary[i]) {
                    max = ary[i];
                    index = i;
                }
            }

            if (D > max) {
                System.out.println(count);
                break;
            }
            D++;
            ary[index]--;
            count++;
        }
    }
}
