import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String st = sc.next();  // 문자열 입력
        int n = sc.nextInt() - 1;  // 위치 입력 (1-based index를 0-based index로 변환)
        
        System.out.println(st.charAt(n));  // 해당 위치의 문자 출력
        
        sc.close();  // Scanner 닫기
    }
}
