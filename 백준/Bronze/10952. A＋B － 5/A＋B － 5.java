import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String[] a = br.readLine().split(" ");
            int x = Integer.parseInt(a[0]);
            int y = Integer.parseInt(a[1]);
            
            if ( x == 0 && y == 0) {
                break;
            }
            sb.append(x + y).append("\n");
        }
        
        System.out.print(sb);
        
        br.close();
        
    }
}