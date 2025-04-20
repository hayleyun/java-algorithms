import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrM = new int[m];
        for (int i = 0; i < m; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arrM) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            sb.append(countMap.getOrDefault(card, 0)).append(" ");
        }

        System.out.print(sb);
        br.close();
    }
}