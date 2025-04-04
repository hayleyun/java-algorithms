import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = new StringBuilder(st.nextToken()).reverse().toString();
        String b = new StringBuilder(st.nextToken()).reverse().toString();
        
        System.out.print(Math.max(Integer.parseInt(a), Integer.parseInt(b)));
        
        br.close();
    }
}