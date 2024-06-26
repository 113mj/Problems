import java.util.Scanner;

public class Main {
    static int[][] a = new int[30][30];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();    
            int M = sc.nextInt();    
            sb.append(f(M, N)).append('\n');
        }
        System.out.println(sb);
    }

    static int f(int n, int r) {
        if (a[n][r] > 0) {
            return a[n][r];
        }
        if (n == r || r == 0) {
            return a[n][r] = 1;
        }
        return a[n][r] = f(n - 1, r - 1) + f(n - 1, r);
    }
}
