import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            Stack<Character> stack = new Stack<>();
            char[] str = br.readLine().toCharArray();
            
            for (char s : str) {
                if (s == '(') {
                    stack.push(s);
                } else {
                    if (stack.isEmpty()) {
                        stack.push(s);
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            
            if (stack.isEmpty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        
        System.out.print(sb);
        br.close();
    }
}