import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        long answer = 0;

        for(int i = 0; i < s1.length(); i++) {
            for(int j = 0; j < s2.length(); j++) {
                answer += (long) (s1.charAt(i) - '0') *(s2.charAt(j) - '0');
            }
        }
        System.out.println(answer);
    }
}