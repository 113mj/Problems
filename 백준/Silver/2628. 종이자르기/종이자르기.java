import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
        StringTokenizer st = new StringTokenizer(br.readLine()); 		
        int M = Integer.parseInt(st.nextToken()); 	
        int N = Integer.parseInt(st.nextToken()); 		
        int[] cutM = new int[M + 1];		
        int[] cutN = new int[N + 1]; 		
        st = new StringTokenizer(br.readLine());		
        int C = Integer.parseInt(st.nextToken()); 
        for (int i = 0; i < C; i++) {			
            st = new StringTokenizer(br.readLine());			
            int mode = Integer.parseInt(st.nextToken());			
            int num = Integer.parseInt(st.nextToken());	
        if (mode == 0) { 
            cutN[num] = 1;
        } else				
            cutM[num] = 1;		
        }		
        int temp = 0;		
        int maxN = 0;		
        for (int i = 1; i <= N; i++) {			
            temp++;			
            if (cutN[i] == 1 || i == N) {				
                maxN = Math.max(maxN, temp);				
                temp = 0;			
            }		
        }		
        temp = 0;		
        int maxM = 0;		
        for (int i = 1; i <= M; i++) {			
            temp++;			
            if (cutM[i] == 1 || i == M) {				
                maxM = Math.max(maxM, temp);				
                temp = 0;			
            }		
        }		
        System.out.println(maxM * maxN);	
    }
}