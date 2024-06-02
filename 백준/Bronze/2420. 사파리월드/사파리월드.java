import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long m, n;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextLong();
        n = scanner.nextLong();
        System.out.println(Math.abs(m - n));
    }
}
