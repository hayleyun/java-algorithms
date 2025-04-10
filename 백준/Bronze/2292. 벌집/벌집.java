import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int room = 1;
        int range = 1;
        while (range < n) {
            range = range + (6 * room);
            room++;
        }
        
        System.out.print(room);
        br.close();
    }
}