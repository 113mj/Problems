import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 첫 번째 입력: 배열의 크기 N
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        // N개의 정수 입력 받기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // 배열 정렬
        Arrays.sort(arr);
        
        // 정렬된 배열을 StringBuilder에 추가
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append('\n');
        }
        
        // 결과 출력
        System.out.print(sb);
    }
}
