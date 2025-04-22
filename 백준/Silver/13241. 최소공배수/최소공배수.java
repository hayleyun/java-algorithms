import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        System.out.print(getLCM(a, b));
        br.close();
    }
    
    private static long getGCD(long a, long b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
    
    private static long getLCM(long a, long b) {
        return (a * b) / getGCD(a, b);
    }
}