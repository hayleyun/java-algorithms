import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> listX = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listX.add(Integer.parseInt(st.nextToken()));
        }
        
        Set<Integer> setX = new HashSet<>(listX);
        List<Integer> sortListX = new ArrayList<>(setX);
        Collections.sort(sortListX);
        
        Map<Integer, Integer> compressedMap = new HashMap<>();
        for (int i = 0; i < sortListX.size(); i++) {
            compressedMap.put(sortListX.get(i), i);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int x : listX) {
            sb.append(compressedMap.get(x)).append(" ");
        }
        
        System.out.print(sb);
        br.close();
    }
}