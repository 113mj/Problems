import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[][] num = new int[N][5];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                num[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int outputNum = 0;
        int outputSum = -1;

        for (int l = 0; l < N; l++) {
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    for (int k = j + 1; k < 5; k++) {
                        int sum = num[l][i] + num[l][j] + num[l][k];
                        int lastDigit = sum % 10;
                        if (lastDigit > outputSum) {
                            outputSum = lastDigit;
                            outputNum = l;
                        } else if (lastDigit == outputSum && l > outputNum) {
                            outputNum = l;
                        }
                    }
                }
            }
        }

        System.out.println(outputNum + 1);
    }
}
