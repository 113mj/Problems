import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = 0; // Initialize x inside the loop to reset for each line

            for (int j = 0; j < 4; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    x++;
                }
            }
            
            if (x == 0)
                System.out.println("D");
            else if (x == 1)
                System.out.println("C");
            else if (x == 2)
                System.out.println("B");
            else if (x == 3)
                System.out.println("A");
            else
                System.out.println("E");
        }
    }
}
