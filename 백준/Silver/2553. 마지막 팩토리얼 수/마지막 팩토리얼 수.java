import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        long temp=1;
        for(int i=1; i<=n; i++){
            temp=temp*i;
            if(temp%10==0){
                temp=num(temp);
            }
            temp%=10000000;
        }
        bw.write(temp%10+"");
        bw.flush();
    }
    public static long num(long n){
        while(n%10==0){
            n/=10;
        }
        return n;
    }
}