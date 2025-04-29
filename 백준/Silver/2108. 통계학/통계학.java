import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        int sum = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        
        Arrays.sort(arr);
        
        // 산술평균
        bw.write(Math.round((double) sum / n) + "\n");
        
        // 중앙값
        bw.write(arr[n / 2] + "\n");
        
        // 최빈값
        int maxFreq = Collections.max(freqMap.values()); // 많이 나온 수
        List<Integer> modeList = new ArrayList<>(); // 최빈값 후보
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            // 가장 큰 빈도 수인 숫자만 골라서 저장
            if (entry.getValue() == maxFreq) {
                modeList.add(entry.getKey());
            }
        }
        
        Collections.sort(modeList);
        bw.write((modeList.size() >= 2 ? modeList.get(1) : modeList.get(0)) + "\n");
        
        // 범위
        bw.write(arr[n - 1] - arr[0] + "\n");
        
        bw.flush();
        bw.close();
        br.close();
    }
}