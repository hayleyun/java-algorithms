import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] types = new int[n];
        int[] initial = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            types[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            initial[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] toPush = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            toPush[i] = Integer.parseInt(st.nextToken());
        }

        // 큐(0)인 자료구조만 담기
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (types[i] == 0) {
                queue.addLast(initial[i]);
            }
        }

        // 결과 만들기
        StringBuilder sb = new StringBuilder();
        for (int x : toPush) {
            queue.addFirst(x);
            sb.append(queue.removeLast()).append(' ');
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}