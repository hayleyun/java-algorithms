import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            int money = Integer.parseInt(br.readLine());
            if (money == 0) {
                stack.pop();
            } else {
                stack.push(money);
            }
        }
        
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }
        
        System.out.print(sum);
        br.close();
    }
}