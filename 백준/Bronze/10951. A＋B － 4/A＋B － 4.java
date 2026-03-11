import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String line;

        int A, B;

        while((line = br.readLine()) != null) {
            if (line.isEmpty()) continue;

            st = new StringTokenizer(line);
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write(A + B + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}