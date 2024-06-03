import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        // 입력받아 배열 A를 초기화
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // 입력받아 배열 B를 초기화
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // 배열 A와 B의 합을 계산하고 출력
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                A[i][j] = A[i][j] + B[i][j];
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
