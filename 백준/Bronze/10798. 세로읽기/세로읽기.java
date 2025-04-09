import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = new String[5];
        
        int maxLength = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = br.readLine().replace(" ","");
            if (a[i].length() > maxLength) {
                maxLength = a[i].length();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < a[j].length()) {
                    sb.append(a[j].charAt(i));
                }
            }
        }
        
        System.out.print(sb);
        br.close();
    }
}