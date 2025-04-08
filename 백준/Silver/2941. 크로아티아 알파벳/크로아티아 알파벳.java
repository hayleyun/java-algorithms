import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // dz=
            if (i + 2 < s.length() && s.charAt(i) == 'd' 
                && s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
                count++;
                i += 2;
            } else if (i + 1 < s.length()) {
                // c= c- d- lj nj s= z=
                String pair = "" + s.charAt(i) + s.charAt(i + 1);
                if (pair.equals("c=") || pair.equals("c-") || pair.equals("d-") 
                    || pair.equals("lj") || pair.equals("nj") 
                    || pair.equals("s=") || pair.equals("z=")) {
                    count++;
                    i++;
                } else {
                    count++;
                }
            } else {
                count++;
            }
        }
        
        System.out.print(count);
        br.close();
    }
}