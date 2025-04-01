import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        
        if (min >= 45) {
            System.out.print(hour + " " + (min - 45));
        } else {
            hour--;
            min = 60 - (45 - min);
            if (hour < 0) {
                hour = 23;
            }
            System.out.print(hour + " " + min);
        }
        
        sc.close();
        
    }
}