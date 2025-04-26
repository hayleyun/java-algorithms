import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.offer(new int[]{i, Integer.parseInt(st.nextToken())});
        }
        
        while (!deque.isEmpty()) {
            int[] balloon = deque.pollFirst();
            int move = balloon[1];
            bw.write(balloon[0] + " ");
            
            if (deque.isEmpty()) break;
            
            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    deque.offerLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.offerFirst(deque.pollLast());
                }
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}