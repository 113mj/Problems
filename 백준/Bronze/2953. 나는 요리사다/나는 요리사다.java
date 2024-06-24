import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] score = new int[5][4];
        int Name = 0;
        int FinalScore = 0;

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                score[i][j] = sc.nextInt();
            }
        }

        int b;
        for(int i = 0; i < 5; i++) {
            b = 0;
            for(int j = 0; j < 4; j++) {
                b += score[i][j];
            }

            if(b > FinalScore) {
                FinalScore = b;
                Name = i + 1;
            }
        }
        System.out.println(Name + " " + FinalScore);
    }
}
