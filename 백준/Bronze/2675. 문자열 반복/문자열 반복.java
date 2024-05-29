import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // 테스트 케이스의 수
        int T = in.nextInt();
        
        // 각 테스트 케이스 처리
        for (int i = 0; i < T; i++) {
            int R = in.nextInt();  // 반복 횟수
            String S = in.next();  // 입력 문자열
            
            // 문자열의 각 문자를 반복 횟수만큼 출력
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();  // 각 테스트 케이스 출력 후 줄바꿈
        }
    }
}
