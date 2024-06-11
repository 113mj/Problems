import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        f(input);
    }

    public static void f(String str) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] find = alphabet.toCharArray();
        char[] a = str.toCharArray();
        int[] answer = new int[26];
        
        for (int i = 0; i < 26; i++) {
            answer[i] = -1;
        }
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (a[i] == find[j] && answer[j] == -1) {
                    answer[j] = i;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
