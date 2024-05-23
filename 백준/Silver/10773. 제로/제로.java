import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int a = 0;
        int answer = 0;

        int stack[] = new int[k];
        for (int i = 0; i < k; i++) {
            int j = scanner.nextInt();
            if (j != 0) {
                stack[a] = j;
                a++;
            } else {
                a--;
                stack[a] = 0;
            }
        }

        for (int i = 0; i < a; i++) {
            answer += stack[i];
        }

        System.out.println(answer);
    }
}
