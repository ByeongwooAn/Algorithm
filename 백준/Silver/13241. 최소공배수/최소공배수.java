import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long A, B;

        StringBuilder sb = new StringBuilder();
        
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        long bigNum = 0;
        long abMul = A * B;

        if(A == 1 || B == 1) {
            sb.append(A * B).append("\n");
        } else {
            bigNum = Math.max(A, B);

            for(long i = A * B; i >= bigNum; i -= bigNum) {
                if(i % A == 0 && i % B == 0) {
                    abMul = Math.min(abMul, i);
                }
            }

            sb.append(abMul).append("\n");
        }

        sb.delete(sb.length() - 1, sb.length());

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}