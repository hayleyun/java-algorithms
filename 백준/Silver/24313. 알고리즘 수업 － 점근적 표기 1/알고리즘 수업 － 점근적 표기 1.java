import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a1 = Long.parseLong(st.nextToken());
        long a0 = Long.parseLong(st.nextToken());
        long c = Long.parseLong(br.readLine());
        long n0 = Long.parseLong(br.readLine());
        
        // f(n) = a1 * n0 + a0, g(n) = c * n0
        // a1 must be <= c so that f(n) doesn't grow faster than c·n
        if (a1 * n0 + a0 <= c * n0 && c >= a1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        br.close();
    }
}