import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        StringBuilder result = new StringBuilder();
        result.append("<");

        while (!queue.isEmpty()) {
            // K-1번 큐의 앞에서 뒤로 이동
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            // K번째 사람 제거
            result.append(queue.poll());
            if (!queue.isEmpty()) {
                result.append(", ");
            }
        }

        result.append(">");
        System.out.println(result.toString());
    }
}
