import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int count = Integer.parseInt(br.readLine());

            while (count-- > 0) {
                sb.append(func(br.readLine()) ? "Yes\n" : "No\n");
            }
            System.out.println(sb);
        }

    private static boolean func (String str) {
            str = str.toLowerCase();
            for (int i = 0; i < str.length()/2; i++) {
                if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                    return false;
                }
            }
            return true;
    }
}