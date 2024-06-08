import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();
            if (str.equals("0")) {
                break;
            }
            f(str);
        }
    }

    public static void f(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
