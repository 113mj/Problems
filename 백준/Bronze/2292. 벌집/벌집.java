import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); // 입력된 숫자 N
        int count = 1; // 겹 수(최소 루트)
        int range = 2; // 범위 (최솟값 기준)

        if (N == 1) {
            System.out.print(1); // N이 1일 경우, 첫 번째 위치
        } else {
            // 범위가 N보다 커지기 직전까지 반복
            while (range <= N) {
                range = range + (6 * count); // 다음 범위의 최솟값으로 초기화
                count++; // count 1 증가
            }
            System.out.print(count); // 결과 출력
        }
    }
}
