import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int[] counts = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'A']++;
        }
        
        int max = -1;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (counts[i] > max) {
                max = counts[i];
                result = (char) (i + 'A');
            } else if (counts[i] == max) {
                result = '?';
            }
        }
        
        System.out.print(result);
        br.close();
    }
}