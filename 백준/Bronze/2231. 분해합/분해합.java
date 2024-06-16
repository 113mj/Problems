import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(findConstructor(x));
    }

    public static int findConstructor(int x) {
        for (int i = 1; i < x; i++) {
            int sum = i;
            int number = i;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum == x) {
                return i;
            }
        }

        return 0;
    }
}
