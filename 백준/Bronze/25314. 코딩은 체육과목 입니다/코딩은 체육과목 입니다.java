import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int a = Integer.parseInt(br.readLine());
        int count = a / 4;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= count; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb.toString());
        
        br.close();
        
    }
}