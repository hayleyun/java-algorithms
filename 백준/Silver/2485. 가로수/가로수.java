import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // 심어져 있는 가로수
        int[] trees = new int[n];
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }
        
        // 각 가로수 사이 간격 구하기 (뒷나무 - 앞나무)
        int[] diffs = new int[n - 1];
        for (int i = 1; i < n; i++) {
            diffs[i - 1] = trees[i] - trees[i - 1];
        }
        
        // 최대공약수 구하기 (나무 간격에 몇개의 나무가 심어져야 하는지)
        int gcd = diffs[0];
        for (int i = 1; i < diffs.length; i++) {
            gcd = getGCD(gcd, diffs[i]);
        }
        
        // 새로 심어야 하는 나무 수 (간격 / 최대공약수 - 1 (-1은 이미 심어져 있는 나무))
        int result = 0;
        for (int diff : diffs) {
            result += diff / gcd - 1;
        }
        
        System.out.print(result);
        br.close();
    }
    
    private static int getGCD(int a, int b) {
        if (b == 0 ) return a;
        return getGCD(b, a % b);
    }
}