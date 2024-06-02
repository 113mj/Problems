import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] ary = new int[x];

        for (int i = 0; i < x; i++) {
            ary[i] = scanner.nextInt();
        }

        for (int i = 0; i < x; i++) {
            if (ary[i] < y) {
                System.out.println(ary[i]);
            }
        }
        
        scanner.close();
    }
}
