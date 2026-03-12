import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S;
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            S = br.readLine();

            if(S.length() == 1) {
                bw.write(String.valueOf(S.charAt(0)) + S.charAt(0) + "\n");
            } else {
                bw.write(String.valueOf(S.charAt(0)) + S.charAt(S.length() - 1) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}