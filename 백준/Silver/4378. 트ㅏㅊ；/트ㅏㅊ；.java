import java.io.*;


public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String keyBoard1 = "`1234567890-=";
            String keyBoard2= "QWERTYUIOP[]\\";
            String keyBoard3 = "ASDFGHJKL;'";
            String keyBoard4 = "ZXCVBNM,./";
            String[] keyboards = {keyBoard1, keyBoard2, keyBoard3, keyBoard4};

            String input = "";
            while ((input = br.readLine()) != null) {
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (c == ' ') {
                        bw.write(" ");
                    } else {
                        for (int j = 0; j < keyboards.length; j++) {
                            if (keyboards[j].contains(c + "")) {
                                bw.write(keyboards[j].charAt(keyboards[j].indexOf(c) - 1));
                                break;
                            }
                        }
                    }
                }
                bw.write("\n");
                bw.flush();
            }
        }
}