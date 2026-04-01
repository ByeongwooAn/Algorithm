import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 로그에 기록된 출입 기록의 수

        HashMap<String, String> mapLog = new HashMap<>(); // 로그를 저장할 HashMap

        // 로그 입력
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            mapLog.put(st.nextToken(), st.nextToken());
        }

        List<String> list = new ArrayList<>(); // 현재 회사에 있는 사람을 저장할 리스트

        // 출입 기록이 enter인 사람 추출
        // HahsMap의 값이 enter인 key 추출
        for(Map.Entry<String, String> entry : mapLog.entrySet()) {
            if("enter".equals(entry.getValue())) {
                list.add(entry.getKey());
            }
        }

        list.sort(Collections.reverseOrder()); // 현재 회사에 있는 사람을 사전 순의 역순으로 정렬

        for(int i = 0; i < list.size(); i++) {
            bw.write(list.get(i));
            bw.newLine(); // 줄 바꿈
        }

        bw.flush();
        bw.close();
        br.close();
    }
}