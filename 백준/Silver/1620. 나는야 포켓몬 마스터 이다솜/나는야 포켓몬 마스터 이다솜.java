import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> numbers = new HashMap<>();
        String[] names = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            numbers.put(name, i);
            names[i] = name;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0))) {
                sb.append(names[Integer.parseInt(query)]).append("\n");
            } else {
                sb.append(numbers.get(query)).append("\n");
            }
        }
        
        System.out.print(sb);
        br.close();
    }
}