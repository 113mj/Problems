import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c;
        int answer = 0;

        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= i; j++) {
                c = N - i - j;
                if (i + j > c && c > 0 && c >= i) { // 삼각형 중 c는 가장 긴 길이
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
