import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double XA = Double.parseDouble(st.nextToken());
        double YA = Double.parseDouble(st.nextToken());
        double XB = Double.parseDouble(st.nextToken());
        double YB = Double.parseDouble(st.nextToken());
        double XC = Double.parseDouble(st.nextToken());
        double YC = Double.parseDouble(st.nextToken());

        double answer = 0.0;

        if (XA == XB && XB == XC || YA == YB && YB == YC) {
            answer = -1.0;
        } else if (YA - YB != 0 && YA - YC != 0 && YB - YC != 0 &&
                   (XA - XB) / (YA - YB) == (XB - XC) / (YB - YC) && 
                   (XB - XC) / (YB - YC) == (XA - XC) / (YA - YC)) {
            answer = -1.0;
        } else {
            double dAB = Math.sqrt(Math.pow(XA - XB, 2) + Math.pow(YA - YB, 2));
            double dBC = Math.sqrt(Math.pow(XB - XC, 2) + Math.pow(YB - YC, 2));
            double dCA = Math.sqrt(Math.pow(XC - XA, 2) + Math.pow(YC - YA, 2));

            answer = (Math.max(dAB, Math.max(dBC, dCA)) - Math.min(dAB, Math.min(dBC, dCA))) * 2;
        }

        System.out.println(answer);
    }
}
