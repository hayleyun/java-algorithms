import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();
        
        int totalMin = (hour * 60) + min + time;
        hour = (totalMin / 60) % 24;
        min = totalMin % 60;
        
        System.out.print(hour + " " + min);
        
        sc.close();
        
    }
}