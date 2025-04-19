import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> cardSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            cardSet.add(Integer.parseInt(st.nextToken()));
        }
        
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(cardSet.contains(num) ? "1 " : "0 ");
        }
        
        System.out.print(sb);
        br.close();
    }
}