import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String line = br.readLine();
            if (line.equals(".")) break;
            
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;
            for (char s : line.toCharArray()) {
                if (s == '(' || s == '[') {
                    stack.push(s);
                } else if (s == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                } else if (s == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                }
            }
            
            if (stack.isEmpty() && isBalanced) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        
        System.out.print(sb);
        br.close();
    }
}