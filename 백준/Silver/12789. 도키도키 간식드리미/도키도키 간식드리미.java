import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }
        
        Stack<Integer> stack = new Stack<>();
        int order = 1;
        while (!queue.isEmpty() || !stack.isEmpty()) {
            if (!queue.isEmpty() && queue.peek() == order) {
                queue.poll();
                order++;
            } else if (!stack.isEmpty() && stack.peek() == order) {
                stack.pop();
                order++;
            } else if (!queue.isEmpty()) {
                stack.push(queue.poll());
            } else {
                break;
            }
        }
        
        if (stack.isEmpty()) {
            System.out.print("Nice");
        } else {
            System.out.print("Sad");
        }
        
        br.close();
    }
}