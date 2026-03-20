import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashMap<Integer, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 10; i++) {
            map.put(i, (char)('0' + i));
        }

        for(int i = 0; i < 26; i++) {
            map.put(10 + i, (char)('A' + i));
        }

        if(N == 0) {
            bw.write(String.valueOf(N));
        } else {
            while(N > 0) {
                sb.append(map.get(N % B));
                N /= B;
            }
            
            bw.write(String.valueOf(sb.reverse()));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}