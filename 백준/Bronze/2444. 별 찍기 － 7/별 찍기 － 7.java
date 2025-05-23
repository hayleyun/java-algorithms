import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            appendLine(sb, n - i, i * 2 - 1);
        }
        
        for (int i = n - 1; i >= 1; i--) {
            appendLine(sb, n - i, i * 2 - 1);
        }
        
        System.out.print(sb);
        br.close();
    }
    
    private static void appendLine(StringBuilder sb, int spaceCount, int starCount) {
        for (int i = 1; i <= spaceCount; i++) {
            sb.append(" ");
        }
        for (int i = 1; i <= starCount; i++) {
            sb.append("*");
        }
        sb.append("\n");
    }
}