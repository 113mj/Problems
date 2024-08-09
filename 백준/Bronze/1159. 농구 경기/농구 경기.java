import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        int N = Integer.parseInt(br.readLine());  
        boolean possible = false;  

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            char c = name.charAt(0);
            arr[c - 'a']++; 

            if (arr[c - 'a'] == 5) {
                possible = true; 
            }
        }

        if (possible) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) {
                    System.out.print((char) (i + 'a'));
                }
            }
        } else {
            System.out.print("PREDAJA"); 
        }
    }
}
