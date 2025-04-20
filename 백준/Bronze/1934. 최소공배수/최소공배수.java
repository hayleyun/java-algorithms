import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(getLCM(a, b));
        }

        br.close();
    }
    
    // 최대공약수(GCD) 구하기
    private static int getGCD(int a, int b) {
        //  유클리드 호제법
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
    
    // 최소공배수(LCM) 구하기
    private static int getLCM(int a, int b) {
        return (a * b) / getGCD(a, b);
    }
}