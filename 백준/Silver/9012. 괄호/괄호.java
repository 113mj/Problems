import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String input = sc.next();
            f(input);
        }
    }

    public static void f(String str) {
        int balance = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                balance++;
            } else if (str.charAt(i) == ')') {
                balance--;
            }
            if (balance < 0) {
                System.out.println("NO");
                return;
            }
        }
        if (balance == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
