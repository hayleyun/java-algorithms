import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            
            if (x == 0 && y == 0 && z == 0) {
                break;
            }
            
            int[] arr = {x, y, z};
            sb.append(classfyTriangle(arr)).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    private static String classfyTriangle(int[] arr) {
        Arrays.sort(arr);
        if (arr[0] + arr[1] <= arr[2]) return "Invalid";
        if (arr[0] == arr[1] && arr[0] == arr[2]) return "Equilateral";
        if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) return "Isosceles";
        return "Scalene";
    }
}