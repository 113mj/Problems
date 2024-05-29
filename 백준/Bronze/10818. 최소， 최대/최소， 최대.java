import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] a = new int[N];

        for(int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        
        Arrays.sort(a);

        System.out.println(a[0]);
        System.out.println(a[N - 1]);
    }
}