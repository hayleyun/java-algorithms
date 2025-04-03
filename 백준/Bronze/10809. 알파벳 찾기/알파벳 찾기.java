import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int[] result = new int[26];
        for (int i = 0; i < 26; i++) {
            result[i] = -1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (result[ch - 'a'] == -1) {
                result[ch - 'a'] = i;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(result[i] + " ");
        }
        
        System.out.print(sb);
        
        br.close();
    }
}