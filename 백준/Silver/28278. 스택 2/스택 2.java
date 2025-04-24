import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            
            switch (cmd) {
                case 1 :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2 :
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;
                case 3 :
                    sb.append(stack.size()).append("\n");
                    break;
                case 4 :
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 5 :
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }
        
        System.out.print(sb);
        br.close();
    }
}