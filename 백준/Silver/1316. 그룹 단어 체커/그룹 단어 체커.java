import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++;
            }
        }
        
        System.out.print(count);
        br.close();
    }
    
    private static boolean isGroupWord(String word) {
        Set<Character> seen = new HashSet<>();
        char prev = 0;
        
        for (int i = 0; i < word.length(); i++) {
            char now = word.charAt(i);
            if (prev != now) {
                if (seen.contains(now)) {
                    return false;
                } else {
                    seen.add(now);
                }
            }
            prev = now;
        }
        return true;
    }
}