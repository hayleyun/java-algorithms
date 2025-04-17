import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        board = new char[n][m];
        
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                min = Math.min(min, repaintCount(i, j));
            }
        }
        
        System.out.print(min);
        br.close();
    }
    
    private static int repaintCount(int x, int y) {
        int countW = 0;
        int countB = 0;
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'W') countW++;
                    if (board[i][j] != 'B') countB++;
                } else {
                    if (board[i][j] != 'B') countW++;
                    if (board[i][j] != 'W') countB++;
                }
            }
        }
        return Math.min(countW, countB);
    }
}