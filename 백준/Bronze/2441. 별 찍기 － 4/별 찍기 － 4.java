import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        f(a);
    }

    public static void f(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = x; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
