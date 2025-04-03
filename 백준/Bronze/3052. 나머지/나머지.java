import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> modSet = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            modSet.add(a % 42);
        }
        
        System.out.print(modSet.size());
        br.close();
        
    }
}