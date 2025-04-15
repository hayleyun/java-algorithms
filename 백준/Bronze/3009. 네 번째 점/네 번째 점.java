import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arrX = new int[3];
        int[] arrY = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.print(findUnique(arrX) + " " + findUnique(arrY));
        br.close();
    }
    
    private static int findUnique(int[] arr) {
        if (arr[0] == arr[1]) {
            return arr[2];
        } else if (arr[0] == arr[2]) {
            return arr[1];
        }
        return arr[0];
    }
}