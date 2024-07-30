import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] queue = new int[10000];
        int front = 0;
        int back = 0;
        
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push")) {
                queue[back] = Integer.parseInt(st.nextToken());
                back++;
            } else if (str.equals("pop")) {
                if (front == back) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue[front]);
                    front++;
                }
            } else if (str.equals("size")) {
                System.out.println(back - front);
            } else if (str.equals("empty")) {
                System.out.println(front == back ? 1 : 0);
            } else if (str.equals("front")) {
                if (front == back) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue[front]);
                }
            } else if (str.equals("back")) {
                if (front == back) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue[back - 1]);
                }
            }
        }
    }
}
