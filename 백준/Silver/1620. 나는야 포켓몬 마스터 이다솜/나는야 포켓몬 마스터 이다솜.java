import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 도감에 수록되어 있는 포켓몬의 개수
        int M = Integer.parseInt(st.nextToken()); // 맞춰야하는 문제의 개수

        HashMap<Integer, String> pocketmonNo = new HashMap<>(); // 포켓몬을 번호로 저장할 HashMap
        HashMap<String, Integer> pocketmonName = new HashMap<>(); // 포켓몬을 이름으로 저장할 HashMap

        String name; // 포켓몬 이름을 저장할 변수
        String s; // 문제를 입력 받을 변수

        int num = 0; // 포켓몬 번호를 저장할 변수

        // 포켓몬 입력
        for(int i = 1; i <= N; i++) {
            name = br.readLine();
            pocketmonNo.put(i, name);
            pocketmonName.put(name, i);
        }

        for(int i = 0; i < M; i++) {
            s = br.readLine();

            if(Character.isDigit(s.charAt(0))) {
                num = Integer.parseInt(s);
                bw.write(pocketmonNo.get(num) + "\n");
            } else {
                bw.write(pocketmonName.get(s) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}