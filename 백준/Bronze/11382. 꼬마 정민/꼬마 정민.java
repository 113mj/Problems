import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long answer = 0;
        for (int i = 0; i < 3; i++) {
            long j = scanner.nextLong();
            answer += j;
        }

        System.out.println(answer);
    }
}
