import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abc = new int[3];

        for (int i = 0; i < 3; i++) {
            abc[i] = sc.nextInt();
        }

        System.out.println(abc[0] + abc[1] - abc[2]);
        stringPlus(abc);
    }

    public static void stringPlus(int[] x) {
        String[] y = new String[3];
        for (int i = 0; i < 3; i++) {
            y[i] = String.valueOf(x[i]);
        }
        String a = y[0].concat(y[1]);
        int b = Integer.parseInt(a);
        System.out.println(b - x[2]);
    }
}
