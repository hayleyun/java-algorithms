import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch (cmd) {
                case "push" :
                    deque.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    bw.write((deque.isEmpty() ? -1 : deque.poll()) + "\n");
                    break;
                case "size" :
                    bw.write(deque.size() + "\n");
                    break;
                case "empty" :
                    bw.write((deque.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "front" :
                    bw.write((deque.isEmpty() ? -1 : deque.peekFirst()) + "\n");
                    break;
                case "back" :
                    bw.write((deque.isEmpty() ? -1 : deque.peekLast()) + "\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}