import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();
        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i < H; i++) {
            int pricePerPerson = sc.nextInt();
            for (int j = 0; j < W; j++) {
                int availableBeds = sc.nextInt();
                if (availableBeds >= N) {
                    int totalCost = pricePerPerson * N;
                    if (totalCost <= B) {
                        minCost = Math.min(minCost, totalCost);
                    }
                }
            }
        }

        if (minCost == Integer.MAX_VALUE) {
            System.out.println("stay home");
        } else {
            System.out.println(minCost);
        }
    }
}
