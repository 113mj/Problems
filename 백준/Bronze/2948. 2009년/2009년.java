import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt(); 
        int answer = 0;
        int [] days = new int[] {0,0,31,28,31,30,31,30,31,31,30,31,30,31};
        String [] day = { "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
        for(int i = 0; i <= m; i++)
            answer += days[i];
        answer += d;
        System.out.println(day[answer%7]);
    }
}