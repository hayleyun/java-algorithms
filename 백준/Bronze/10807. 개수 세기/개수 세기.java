import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split(" ");
        int c = Integer.parseInt(br.readLine());
        int result = 0;
        
        for (int i = 0; i < a; i++) {
            if (Integer.parseInt(b[i]) == c) {
                result++;
            }
        }
        System.out.print(result);
        br.close();
    }
}