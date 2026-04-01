import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 숫자 카드의 개수

        /*입력 순서를 유지하려면 HashMap 대신에 LinkedHashMap을 사용할 것 */

        LinkedHashMap<Integer, Integer> mapN = new LinkedHashMap<>(); // 상근이가 가지고 있는 숫자 카드

        st = new StringTokenizer(br.readLine());


        // 상근이가 가지고 있는 숫자 카드 입력
        for(int i = 0; i < N; i++) {
            mapN.put(Integer.parseInt(st.nextToken()), i);
        }

        int M = Integer.parseInt(br.readLine()); // 비교해야할 숫자 카드의 개수

        LinkedHashMap<Integer, Integer> mapM = new LinkedHashMap<>(); // 비교 해야할 숫자 카드

        st = new StringTokenizer(br.readLine());

        // 비교 해야할 숫자 카드 입력
        for(int i = 0; i < M; i++) {
            mapM.put(Integer.parseInt(st.nextToken()), i);
        }

        // 카드 비교
        for(int key : mapM.keySet()) {
            if(mapN.containsKey(key)) {
                bw.write(1 + " ");
            } else {
                bw.write(0 + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}