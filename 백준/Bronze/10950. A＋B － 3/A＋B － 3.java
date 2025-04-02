import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            sb.append(a + b).append("\n");
        }
        
        System.out.print(sb);
        sc.close();
        
    }
}