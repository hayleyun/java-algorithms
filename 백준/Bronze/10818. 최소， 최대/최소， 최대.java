import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
                
        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(b[i]);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        System.out.print(min + " " + max);
        br.close();
        
    }
}