import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] answer = new String[T];

        for (int i = 0; i < T; i++) {
            String a = scanner.next();
            answer[i] = a.substring(0, 1) + a.substring(a.length() - 1);
        }

        for (int i = 0; i < T; i++) {
            System.out.println(answer[i]);
        }

        scanner.close();
    }
}
