import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        StringBuilder sb = new StringBuilder();

        while(true) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int longLine = Math.max(A, Math.max(B, C));
            int short1 = Math.min(A, Math.min(B, C));
            int short2 = A + B + C - longLine - short1;

            //System.out.println(short1 + " " + short2);

            if(A == 0 && B == 0 && C == 0) {
                break;
            }
            
            if(short1 + short2 <= longLine) {
                sb.append("Invalid\n");
            } else if(A == B && A == C && B == C) {
                sb.append("Equilateral\n");
            } else if(A == B || A == C || B == C) {
                sb.append("Isosceles\n");
            } else if(A != B && A != C && B != C) {
                sb.append("Scalene\n");
            }
        }

        sb.delete(sb.length() - 1, sb.length());

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
