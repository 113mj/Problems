import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arg = br.readLine();

        for (int i = 0; i < arg.length() / 2; i++) {
            if (arg.charAt(i) != arg.charAt(arg.length() - 1 - i)) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
