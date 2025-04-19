import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        List<String[]> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            people.add(br.readLine().split(" "));
        }
        
        people.sort(Comparator.comparingInt(a -> Integer.parseInt(a[0])));
        
        StringBuilder sb = new StringBuilder();
        for (String[] person : people) {
            sb.append(person[0]).append(" ").append(person[1]).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}