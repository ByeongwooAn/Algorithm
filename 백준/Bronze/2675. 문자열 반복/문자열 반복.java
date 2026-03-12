import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine()), R;
        String S;

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            S = st.nextToken();

            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    bw.write(S.charAt(j));
                }
            }
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}