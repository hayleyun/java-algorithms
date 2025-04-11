import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int line = 1;
        int count = 0;
        while (line + count < n) {
            count += line;
            line++;
        }
        
        int idxInLine = n - count;
        
        int numerator = 0;
        int denominator = 0;
        if (line % 2 == 0) {
            numerator = idxInLine;
            denominator = line - idxInLine + 1;
        } else {
            numerator = line - idxInLine + 1;
            denominator = idxInLine;
        }
        
        System.out.print(numerator + "/" + denominator);
        br.close();
    }
}