import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 듣지 못한 사람의 수
        int M = Integer.parseInt(st.nextToken()); // 보지 못한 사람의 수

        HashMap<String, Integer> map = new HashMap<>(); // 듣지 못한 사람의 집합

        // 듣지 못한 사람 입력
        for(int i = 0; i < N; i++) {
            map.put(br.readLine(), i);
        }

        List<String> list = new ArrayList<>(); // 듣지도 보지도 못한 사람의 집합
        String s; // 보지 못한 사람의 이름

        // 보지 못한사람과 비교
        for(int i = 0; i < M; i++) {
            s = br.readLine();

            if(map.containsKey(s)) {
                list.add(s);
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for(String people : list) {
            sb.append(people).append("\n");
        }

        if(sb.length() > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }

        bw.write(list.size() + "\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}