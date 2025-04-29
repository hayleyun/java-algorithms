import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        
        System.out.print(binomialCoefficient(n, k));
        br.close();
    }
    
    private static long binomialCoefficient(int n, int k) {
        if (k < n - k) {
            k = n - k; // k가 더 크면 n - k로 바꿔서 계산 최적화
        }
        
        long result = 1;
        
        // (n - k + 1)부터 n까지 곱하고 k!로 나누는 방식으로 계산
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1); // 나누면서 계산하기
        }
        
        return result;
    }
}