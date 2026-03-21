import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int n = 0, answer = 0;

        while(st.hasMoreTokens()) {
            n = Integer.parseInt(st.nextToken());

            int count = 0;

            for(int i = 1; i < Math.sqrt(n); i++) {
                if(n % i == 0) {
                    count++;
                }

                if((i + 1) * (i + 1) == n) {
                    count++;
                }
            }

            //if(n == Ma)

            if(count == 1) {
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}