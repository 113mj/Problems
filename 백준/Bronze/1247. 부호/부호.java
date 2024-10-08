import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++) {
            BigInteger a = new BigInteger("0");
            int N = Integer.parseInt(br.readLine());

            for(int j = 0; j < N; j++) {
                BigInteger b = new BigInteger(br.readLine());

                a = a.add(b);
            }

            if(a.compareTo(BigInteger.ZERO) == -1)
                System.out.println("-");
            else if (a.compareTo(BigInteger.ZERO) == 1)
                System.out.println("+");
            else
                System.out.println(0);
        }
    }
}