import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int answer = 0;
        int ary[] = new int[n];

        for (int i = 0; i < n; i++) {
            ary[i] = scanner.nextInt();
        }
        Arrays.sort(ary);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int l = ary[i] + ary[j] + ary[k];
                    if (l <= m && answer < l) {
                        answer = l;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}