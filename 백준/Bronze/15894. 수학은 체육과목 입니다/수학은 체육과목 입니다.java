import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long answer = 0;

        long n = Long.parseLong(br.readLine());

        if(n == 1) {
            answer = 4;
        } else {
            // 상단 1
            // 세로변 회차 * 2
            // 밑변 = 회차
            // 중간변 = 회차 - 1
            answer = 1 + (n * 2) + n + (n - 1);
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}