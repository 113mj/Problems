import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // 입력된 문자열의 첫 번째 문자의 아스키 코드 값을 가져옴
        int ch = in.next().charAt(0);
        
        // 아스키 코드 값을 출력
        System.out.print(ch);
    }
}
