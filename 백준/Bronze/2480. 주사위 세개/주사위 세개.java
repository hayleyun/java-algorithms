import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a == b && b == c) {
            System.out.print(10000 + (a * 1000));
        } else if (a == b || a == c) {
            System.out.print(1000 + (a * 100));
        } else if (b == c) {
            System.out.print(1000 + (b * 100));
        } else {
            int max = Math.max(a, Math.max(b, c));
            System.out.print(max * 100);
        }
        
        sc.close();
        
    }
}