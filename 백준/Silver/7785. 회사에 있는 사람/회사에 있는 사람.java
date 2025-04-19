import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Set<String> office = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] log = br.readLine().split(" ");
            String name = log[0];
            String action = log[1];
            
            if (action.equals("enter")) {
                office.add(name);
            } else {
                office.remove(name);
            }
        }
        
        List<String> officeList = new ArrayList<>(office);
        officeList.sort(Comparator.reverseOrder());
        
        for (String name : officeList) {
            System.out.println(name);
        }
        
        br.close();
    }
}