import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] xCoords = new int[n];
        int[] yCoords = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xCoords[i] = Integer.parseInt(st.nextToken());
            yCoords[i] = Integer.parseInt(st.nextToken());
        }
        
        if (n < 1) {
            System.out.print(0);
        } else {
            System.out.print(findExtent(xCoords) * findExtent(yCoords));
        }
        
        br.close();
    }
    
    private static int findExtent(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }
}