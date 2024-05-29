import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner in = new Scanner(System.in);
        
        // 첫 번째 입력: 숫자의 자릿수
        int N = in.nextInt();
        // 두 번째 입력: 숫자 문자열
        String a = in.next();
        in.close();
        
        int sum = 0;

        // 각 자릿수를 순회하며 합산
        for (int i = 0; i < N; i++) {
            sum += a.charAt(i) - '0';  // 각 자릿수를 숫자로 변환하여 더함
        }

        // 합산 결과 출력
        System.out.print(sum);
    }
}
