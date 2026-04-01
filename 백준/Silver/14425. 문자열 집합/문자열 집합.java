import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 집합 S에 포함되어 있는 문자열의 개수 N
        int M = Integer.parseInt(st.nextToken()); // 비교해야할 문자열의 개수 M
        int count = 0; // 포함되어 있는 문자열의 개수

        HashMap<Integer, String> mapN = new HashMap<>(); // 집합 S에 포함되어 있는 문자열
        HashMap<Integer, String> mapM = new HashMap<>(); // 비교해야할 문자열

        // 집합 S에 포함된 문자열 입력
        for(int i = 0; i < N; i++) {
            mapN.put(i, br.readLine());
        }

        // 비교해야할 문자열 입력
        for(int i = 0; i < M; i++) {
            mapM.put(i, br.readLine());
        }

        // 문자열 비교
        for(String s : mapM.values()) {
            if(mapN.containsValue(s)) {
                count++; // 개수 증가
            }
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();
    }
}