import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ary = new int[5];
        
        for (int i = 0; i < 5; i++) {
            ary[i] = scanner.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < 5; i++) {
            answer += ary[i] * ary[i];
        }
        answer %= 10;
        
        System.out.println(answer);
        scanner.close();
    }
}
