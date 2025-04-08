import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] pieces = {1, 1, 2, 2, 2, 8};
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pieces.length; i++) {
            int input = Integer.parseInt(st.nextToken());
            sb.append(pieces[i] - input).append(" ");
        }
        
        System.out.print(sb);
        br.close();
    }
}