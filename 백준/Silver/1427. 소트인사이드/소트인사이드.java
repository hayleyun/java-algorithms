import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        
        Integer[] arr = new Integer[n.length()];
        for (int i = 0; i < n.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        
        System.out.print(sb);
        br.close();
    }
}