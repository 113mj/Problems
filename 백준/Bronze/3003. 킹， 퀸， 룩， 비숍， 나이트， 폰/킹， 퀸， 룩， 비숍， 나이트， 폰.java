import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        StringBuilder sb = new StringBuilder();
        sb.append(king - Integer.parseInt(st.nextToken())).append(" ");
        sb.append(queen - Integer.parseInt(st.nextToken())).append(" ");
        sb.append(rook - Integer.parseInt(st.nextToken())).append(" ");
        sb.append(bishop - Integer.parseInt(st.nextToken())).append(" ");
        sb.append(knight - Integer.parseInt(st.nextToken())).append(" ");
        sb.append(pawn - Integer.parseInt(st.nextToken()));

        System.out.println(sb.toString());
    }
}
