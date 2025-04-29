import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.length() >= m) {
                freqMap.put(input, freqMap.getOrDefault(input, 0) + 1);
            }
        }
        
        // 단어 리스트 만들기
        List<String> wordList = new ArrayList<>(freqMap.keySet());
        
        // 정렬하기
        wordList.sort((o1, o2) -> {
            int freq1 = freqMap.get(o1);
            int freq2 = freqMap.get(o2);
            
            // 1. 빈도수가 높은 단어 우선 (내림차순)
            if (freq1 != freq2) {
                return freq2 - freq1;
            }
            
            // 2. 단어 길이가 긴 단어 우선 (내림차순)
            if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            }
            
            // 3. 알파벳 사전순 (오름차순)
            return o1.compareTo(o2);
        });
        
        for (String word : wordList) {
            bw.write(word + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}