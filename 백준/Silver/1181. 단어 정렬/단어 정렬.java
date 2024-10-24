import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        TreeSet<String> set = new TreeSet<>((s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);  
            } else {
                return Integer.compare(s1.length(), s2.length());  
            }
        });

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}