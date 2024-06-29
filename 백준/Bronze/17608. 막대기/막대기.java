import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        int count = 1;
        int maxHeight = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxHeight) {
                count++;
                maxHeight = arr[i];
            }
        }

        System.out.println(count);
    }
}
