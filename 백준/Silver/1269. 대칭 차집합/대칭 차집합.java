import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 집합 A의 원소 개수
        int B = Integer.parseInt(st.nextToken()); // 집합 B의 원소 개수

        HashMap<Integer, Boolean> mapA = new HashMap<>(); // 집합 A

        // 집합 A 입력
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < A; i++) {
            mapA.put(Integer.parseInt(st.nextToken()), true);
        }

        st = new StringTokenizer(br.readLine());
        int num = 0;

        // 차집합의 합집합 만들기
        for(int i = 0; i < B; i++) {
            // 집합 B의 원소 입력
            num = Integer.parseInt(st.nextToken());

            // 집합 A에 집합 B의 원소가 있으면
            if(mapA.containsKey(num)) {
                // 집합 A에서 값을 찾아서 false로 수정
                mapA.put(num, false);
            } else {
                // 없으면 집합 A에 집합 B의 원소를 추가
                mapA.put(num, true);
            }
        }

        // 값이 false인 원소 삭제
        mapA.entrySet().removeIf(entry -> entry.getValue() == false);

        bw.write(String.valueOf(mapA.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}