import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Stack<Character> st = new Stack<>();
            String s = sc.nextLine();
            if (s.equals(".")) 
                break;
            boolean isValid = true; 
            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);

                if (temp == '(' || temp == '[') 
                    st.push(temp); 
                else if (temp == ')' || temp == ']') {
                    if (st.isEmpty() || (st.peek() == '(' && temp == ']') || (st.peek() == '[' && temp == ')')) {
                        isValid = false; 
                        break;
                    }
                    st.pop(); 
                }
            }
            if (!isValid || !st.isEmpty()) 
                System.out.println("no");
            else 
                System.out.println("yes");
        }
    }
}