import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= t; i++) {
            String[] a = br.readLine().split(" ");
            sb.append("Case #" + i + ": " + a[0] + " + " + a[1] + " = " + (Integer.parseInt(a[0]) + Integer.parseInt(a[1])) + "\n");
        }
        
        System.out.print(sb);
        
        br.close();
        
    }
}