import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] candy = new int[N];
        for (int i = 0; i < N; i++) {
            candy[i] = scanner.nextInt();
        }

        int result = 0;
        ArrayList<Integer> oddCandy = new ArrayList<>();

        for (int c : candy) {
            if (c % 2 == 1) 
                oddCandy.add(c);
             else 
                 result += c;
        }

        if (oddCandy.size() % 2 == 1) {
            Collections.sort(oddCandy, Collections.reverseOrder());
            oddCandy.remove(oddCandy.size() - 1);
        }

        for (int c : oddCandy)
            result += c;
        System.out.println(result);
    }
}