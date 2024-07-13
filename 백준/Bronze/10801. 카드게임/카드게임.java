import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[10];
        int[] B = new int[10];
        int aCount = 0;
        int bCount = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                aCount++;
            } else if (A[i] < B[i]) {
                bCount++;
            }
        }

        if (aCount == bCount) {
            System.out.println("D");
        } else if (aCount > bCount) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
