import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = bf.readLine();
        countWords(a);
    }

    public static void countWords(String str) {
        if (str.trim().isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] words = str.trim().split("\\s+");
        System.out.println(words.length);
    }
}
