import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int first = 1, i = 1;
        
        // 1 + 6 * 1 = 7 + 6 * 2 = 19 + 6 * 3 = 37 + 6 * 4 = 61

        while(N > first) {
            first += 6 * i;
            i++;
        }

        bw.write(String.valueOf(i));
        bw.flush();
        bw.close();
        br.close();
    }
}