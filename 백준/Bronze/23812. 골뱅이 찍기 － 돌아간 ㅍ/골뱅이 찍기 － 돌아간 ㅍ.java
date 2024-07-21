import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(br.readLine());
        final String ANNOTATION = "@";
        final String BLANK = " ";
        StringBuilder sb = new StringBuilder();

        final String part01 = ANNOTATION.repeat(N) + BLANK.repeat(N * 3) + ANNOTATION.repeat(N);
  
        final String part02 = ANNOTATION.repeat(N * 5);

        StringBuilder comp01 = new StringBuilder();
        IntStream.range(0, N).forEach(i -> comp01.append(part01).append("\n"));

        StringBuilder comp02 = new StringBuilder();
        IntStream.range(0, N).forEach(i -> comp02.append(part02).append("\n"));

        sb.append(comp01).append(comp02).append(comp01).append(comp02).append(comp01);
        sb.setLength(sb.length() - 1); // Remove the last newline character
        System.out.print(sb);
    }
}
