import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine(); // 문자열 입력
        int N = 1; // 문자열을 확인할 자릿수

        LinkedHashSet<String> setS = new LinkedHashSet<>();

        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j + N <= s.length(); j++) {
                setS.add(s.substring(j, j + N));
            }
            N++;
        }

        bw.write(String.valueOf(setS.size()));

        bw.flush();
        bw.close();
        br.close();
    }
}