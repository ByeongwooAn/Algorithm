import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            for(int j = 1; j <= N; j++) {
                bw.write(j >= N - i ? '*' : ' ');
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}