import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            appendLine(sb, '*', i);
            appendLine(sb, ' ', (n - i) * 2);
            appendLine(sb, '*', i);
            sb.append("\n");
        }
        
        for (int i = n - 1; i >= 1; i--) {
            appendLine(sb, '*', i);
            appendLine(sb, ' ', (n - i) * 2);
            appendLine(sb, '*', i);
            sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    private static void appendLine(StringBuilder sb, char ch, int count) {
        for (int i = 1; i <= count; i++) {
            sb.append(ch);
        }
    }
}