import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ary = new int[N];
        
        for (int i = 0; i < N; i++) {
            ary[i] = scanner.nextInt();
        }
        
        int v = scanner.nextInt();
        int answer = 0;
        
        for (int i = 0; i < N; i++) {
            if (ary[i] == v) {
                answer++;
            }
        }
        
        System.out.println(answer);
        scanner.close();
    }
}
