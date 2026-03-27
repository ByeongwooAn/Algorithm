import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;

        int N = Integer.parseInt(br.readLine());
        int M = N, sum = 0, answer = 0;
        while(M > 0) {
            M--;
            s = String.valueOf(M);

            for(int i = 0; i < s.length(); i++) {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }

            if(N == sum + M) {
                answer = M;
            }

            sum = 0;
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
        br.close();
    }
}