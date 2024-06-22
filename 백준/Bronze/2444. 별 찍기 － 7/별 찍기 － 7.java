import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        f(a);
    }

    public static void f(int x) {
        // 위쪽 피라미드
        for (int i = 1; i <= x; i++) {
            for (int j = x; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 아래쪽 피라미드
        for (int i = 1; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * x - 1) - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
