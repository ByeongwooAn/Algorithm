import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int first = 2;

        for(int i = 0; i < N; i++) {
            first += Math.pow(2, i);
        }

        bw.write(String.valueOf(first *= first));

        bw.flush();
        bw.close();
        br.close();
    }
}