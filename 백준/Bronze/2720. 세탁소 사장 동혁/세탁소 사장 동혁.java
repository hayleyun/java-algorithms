import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            int change = Integer.parseInt(br.readLine());
            
            int quarter = change / 25;
            change %= 25;
            
            int dime = change / 10;
            change %= 10;
            
            int nickel = change / 5;
            change %= 5;
            
            int penny = change;
            
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
        
        br.close();
    }
}