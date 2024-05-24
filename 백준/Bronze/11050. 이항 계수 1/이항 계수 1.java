import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] x = new int[11][11];

        for (int i = 0; i < 11; i++) {
            x[i][0] = 1;
            x[i][1] = i;
        }

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                x[i][j] = x[i - 1][j - 1] + x[i - 1][j];
            }
        }

        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(x[a][b]);
    }
}
