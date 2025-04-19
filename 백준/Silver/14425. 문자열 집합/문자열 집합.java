import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        
        Set<String> setM = new HashSet<>();
        for (int i = 0; i < m; i++) {
            setM.add(br.readLine());
        }
        
        int count = 0;
        for (int i = 0; i < s; i++) {
            String word = br.readLine();
            if (setM.contains(word)) {
                count++;
            }
        }
        
        System.out.print(count);
        br.close();
    }
}