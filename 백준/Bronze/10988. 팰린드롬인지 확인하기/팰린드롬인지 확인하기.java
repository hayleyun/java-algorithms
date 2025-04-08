import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String reversed = new StringBuilder(s).reverse().toString();
        
        if (s.equals(reversed)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
        
        br.close();
    }
}