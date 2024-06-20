import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        f(a);
    }

    public static void f(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = x - 1; j > i; j--) {
                System.out.print(" ");
            }
            int k = 0;
            while (k < 2 * i + 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
        }
    }
}
