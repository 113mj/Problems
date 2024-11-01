import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        String nemo = "(?i).*nemo.*";

        while (!(str = br.readLine()).equals("EOI")) {
            if (str.matches(nemo)) {
                bw.write("Found");
            } else {
                bw.write("Missing");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
