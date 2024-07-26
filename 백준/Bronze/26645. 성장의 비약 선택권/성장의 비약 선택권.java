import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int level = Integer.parseInt(br.readLine());
        
        if (level <= 205)
            System.out.println(1);
        else if (level <= 217)
            System.out.println(2);
        else if (level <= 228)
            System.out.println(3);
        else
            System.out.println(4);
    }
}
