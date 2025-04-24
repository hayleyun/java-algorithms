import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    // 정수 n은 짝수이고, 2 < n <= 1,000,000을 만족 (소수 아님 체크)
    static boolean[] isNotPrime = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // 소수 전처리
        sieve();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int evenNum = Integer.parseInt(br.readLine());
            int count = 0;
            // 3, 7과 7, 3은 같은 파티션이니 중복제거를 위해 evenNum / 2
            for (int j = 2; j <= evenNum / 2; j++) {
                // isNotPrime[j] == false 란 소수
                if (!isNotPrime[j] && !isNotPrime[evenNum - j]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb);
        br.close();
    }

    private static void sieve() {
        // 0과 1은 소수가 아니기 때문에 소수가 아님을 표시
        isNotPrime[0] = isNotPrime[1] = true;

        // i는 현재 검사 중인 소수 후보로 i <= √N 까지만 검사해도 충분함
        for (int i = 2; i * i < isNotPrime.length; i++) {
            // i가 소수인 경우에만 처리
            // 이미 i가 합성수라면 i의 배수는 예전에 다 처리됐기 때문에 패스
            if (!isNotPrime[i]) {
                // i의 배수들은 전부 소수가 아니라고 표시
                // j = i * i 부터 시작한 이유는 이미 이전에 걸러진 번호 제외
                for (int j = i * i; j < isNotPrime.length; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }
}