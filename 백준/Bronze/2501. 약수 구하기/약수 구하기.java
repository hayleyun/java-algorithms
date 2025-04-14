import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        List<Integer> divisors = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        
        if (divisors.size() < k) {
            System.out.println(0);
        } else {
            System.out.println(divisors.get(k - 1));
        }
        
        br.close();
    }
}