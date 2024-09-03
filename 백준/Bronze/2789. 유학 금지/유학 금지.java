import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String ban = "CAMBRIDGE";
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if (ban.indexOf(str.charAt(i)) == -1) {
                result.append(str.charAt(i));
            }
        }

        System.out.println(result.toString());
    }
}
