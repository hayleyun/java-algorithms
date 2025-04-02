import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < Integer.parseInt(a[0]); i++) {
            if (Integer.parseInt(b[i]) < Integer.parseInt(a[1])) {
                sb.append(Integer.parseInt(b[i])).append(" ");
            }
        }
        
        System.out.print(sb);
        br.close();
        
    }
}