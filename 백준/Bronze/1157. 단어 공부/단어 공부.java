import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                count[ch - 'A']++;
            } else {
                count[ch - 'a']++;
            }
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
