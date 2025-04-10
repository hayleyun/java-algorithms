import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String n = arr[0];
        int b = Integer.parseInt(arr[1]);
        
        System.out.print(Integer.parseInt(n, b));
        br.close();
    }
}