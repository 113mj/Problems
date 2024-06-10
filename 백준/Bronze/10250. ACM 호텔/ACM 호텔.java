import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int n = sc.nextInt();
            f(H, n);
        }
    }

    public static void f(int H, int n) {
        int y = n % H;
        int x = (n / H) + 1;
        
        if (y == 0) {
            y = H;
            x -= 1;
        }

        if (x < 10) {
            System.out.println(y + "0" + x);
        } else {
            System.out.println(y + "" + x);
        }
    }
}
