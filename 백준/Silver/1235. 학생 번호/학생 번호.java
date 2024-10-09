import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] students = new int[n + 1][101];

        int sequenceLength = 0;

        for (int i = 1; i <= n; i++) {
            String sequence = br.readLine();
            sequenceLength = sequence.length();
            for (int j = 0; j < sequenceLength; j++) {
                students[i][j + 1] = sequence.charAt(j) - '0';
            }
        }

        int minDifference = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int lastDiffIndex = 0;
                for (int k = sequenceLength; k >= 1; k--) {
                    if (students[i][k] != students[j][k]) {
                        lastDiffIndex = k;
                        break;
                    }
                }
                minDifference = Math.min(minDifference, lastDiffIndex);
            }
        }

        bw.write((sequenceLength - (minDifference - 1)) + "\n");
        bw.flush();
    }
}
