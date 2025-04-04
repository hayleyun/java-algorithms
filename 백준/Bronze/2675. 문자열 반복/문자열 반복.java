import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                for (int k = 0; k < r; k++) {
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }
        br.close();
    }
}