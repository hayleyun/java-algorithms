import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] measures = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            measures[i] = Integer.parseInt(st.nextToken());
        }
        
        int min = measures[0];
        int max = measures[0];
        for (int measure : measures) {
            if (min > measure) min = measure;
            if (max < measure) max = measure;
        }
        
        System.out.print(min * max);
        br.close();
    }
}
