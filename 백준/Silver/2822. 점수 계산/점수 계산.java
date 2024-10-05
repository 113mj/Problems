import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[8];
        int[] check = new int[8];
        int sum = 0;

        for(int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            check[i] = arr[i];
        }
        Arrays.sort(arr);

        for(int i = 3; i < 8; i++) 
            sum += arr[i];

        System.out.println(sum);

        for(int i = 0; i < 8; i++) {
            for(int j = 3; j < 8; j++) {
                if(check[i] == arr[j]) System.out.print((i + 1)+" ");
            }
        }
    }
}
