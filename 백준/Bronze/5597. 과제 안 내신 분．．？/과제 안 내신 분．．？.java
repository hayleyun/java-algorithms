import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] submitted = new boolean[31];
        
        for (int i = 0; i < 28; i++) {
            int a = Integer.parseInt(br.readLine());
            submitted[a] = true;
        }
        
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                System.out.println(i);
            }
        }
        
        br.close();
    }
}