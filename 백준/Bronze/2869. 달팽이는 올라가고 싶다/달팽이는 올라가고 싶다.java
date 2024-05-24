import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // 낮에 올라가는 거리
        int b = scanner.nextInt(); // 밤에 내려가는 거리
        int v = scanner.nextInt(); // 총 가야하는 거리
        
        int answer = (v - b) / (a - b);
        
        // 낮에 다 올라가는 경우를 고려하여 추가로 하루를 더해야 하는지 검사
        if ((v - b) % (a - b) != 0) {
            answer++;
        }

        System.out.println(answer);
    }
}
