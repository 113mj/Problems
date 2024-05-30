import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int answer = 1;

        for(int i = 1; i<=a; i++)
        {
            if (i==0)
                answer = 1;
            else
                answer = answer * i;
        }

        System.out.println(answer);
    }
}


