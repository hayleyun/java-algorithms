import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }
        
        bw.write("<");
        while (!deque.isEmpty()) {
            for (int i = 1; i < k; i++) {
                deque.offerLast(deque.poll());
            }
                        
            if (deque.size() == 1) {
                bw.write(deque.poll() + ">");
                break;
            } else {
                bw.write(deque.poll() + ", ");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}