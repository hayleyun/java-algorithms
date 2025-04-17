import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // Start checking from N - 9 * digit count. Digit count = length of N as string.
        int start = Math.max((n - 9 * String.valueOf(n).length()), 0);
        int result = 0;
        
        for (int m = start; m < n; m++) {
            if (m + digitSum(m) == n) {
                result = m;
                break;
            }
        }
        
        System.out.print(result);
        br.close();
    }
    
    private static int digitSum(int m) {
        int sum = 0;
        while (m > 0) {
            sum += m % 10;
            m /= 10;
        }
        return sum;
    }
}