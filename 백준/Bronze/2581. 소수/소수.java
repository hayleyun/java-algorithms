import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }
        
        if (sum >= 1) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.print(-1);
        }
        
        br.close();
    }
    
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}