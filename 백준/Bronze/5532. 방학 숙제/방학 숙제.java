import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); 
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        int C = sc.nextInt(); 
        int D = sc.nextInt(); 
        
        int daysForA = (int) Math.ceil((double) A / C);
        int daysForB = (int) Math.ceil((double) B / D);

        int maxDays = Math.max(daysForA, daysForB);

        int answer = L - maxDays;
        System.out.println(answer);
    }
}
