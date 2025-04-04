import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        
        if (s.isEmpty()) {
            System.out.print(0);
        } else {
            System.out.print(s.split("\\s+").length);
        }
        
        br.close();
    }
}