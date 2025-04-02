import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= a; i++) {
            String[] b = br.readLine().split(" ");
            sb.append(Integer.parseInt(b[0]) + Integer.parseInt(b[1]) + "\n");
        }
        
        System.out.print(sb);
        
        br.close();
        
    }
}