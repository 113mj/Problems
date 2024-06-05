import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] tShirt = new int[6];
        for (int i = 0; i < 6; i++) {
            tShirt[i] = sc.nextInt();
        }
        int T = sc.nextInt();
        int P = sc.nextInt();

        int answer = 0;

        for (int i = 0; i < 6; i++) {
            answer += tShirt[i] / T;
            if (tShirt[i] % T != 0) {
                answer++;
            }
        }

        System.out.println(answer);
        System.out.println(N / P + " " + N % P);
    }
}
