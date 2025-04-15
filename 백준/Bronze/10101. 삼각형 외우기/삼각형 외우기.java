import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        
        if (sum == 180) {
            System.out.println(classfyTriangle(arr));
        } else {
            System.out.println("Error");
        }
    }
    
    private static String classfyTriangle(int[] arr) {
        if (arr[0] == arr[1] && arr[0] == arr[2]) {
            return "Equilateral";
        } else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
            return "Isosceles";
        }
        return "Scalene";
    }
}