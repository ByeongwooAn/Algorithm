import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int A, B;

        StringBuilder sb = new StringBuilder();

        for(int t = 0; t < T; t++) {
            st= new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            int bigNum = 0;
            int abMul = A * B;

            if(A == 1 || B == 1) {
                sb.append(A * B).append("\n");
            } else {
                bigNum = Math.max(A, B);

                for(int i = A * B; i >= bigNum; i -= bigNum) {
                    if(i % A == 0 && i % B == 0) {
                        abMul = Math.min(abMul, i);
                    }
                }

                sb.append(abMul).append("\n");
            }
        }

        sb.delete(sb.length() - 1, sb.length());

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}