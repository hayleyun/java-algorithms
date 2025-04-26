import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }
        
        while (deque.size() > 1) {
            deque.pollFirst();
            deque.offerLast(deque.pollFirst());
        }
        
        bw.write(deque.peek() + "\n");
        
        bw.flush();
        bw.close();
        br.close();
    }
}