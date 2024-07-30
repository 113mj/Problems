import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] stack = new int[10000];
        int top = -1;

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push")) {
                stack[++top] = Integer.parseInt(st.nextToken());
            } else if (str.equals("pop")) {
                if (top == -1) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[top--]);
                }
            } else if (str.equals("size")) {
                System.out.println(top + 1);
            } else if (str.equals("empty")) {
                System.out.println(top == -1 ? 1 : 0);
            } else if (str.equals("top")) {
                System.out.println(top == -1 ? -1 : stack[top]);
            }
        }
    }
}
