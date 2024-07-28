import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isGood = true;
        int temp = Integer.MIN_VALUE;

        while (sc.hasNextInt()) {
            int a = sc.nextInt();

            if (temp <= a) {
                temp = a;
            } else {
                isGood = false;
                System.out.println("Bad");
                break;
            }
        }
        if (isGood) {
            System.out.println("Good");
        }
    }
}
