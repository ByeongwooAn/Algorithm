import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int[][] arrN = new int[N][2];

        for(int n = 0; n < N; n++) {
            st = new StringTokenizer(br.readLine());

            arrN[n][0] = Integer.parseInt(st.nextToken());
            arrN[n][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrN, (a, b) -> {
            if(a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            }

            return Integer.compare(a[1], b[1]);
        });

        for(int i = 0; i < arrN.length; i++) {
            bw.write(arrN[i][0] + " " + arrN[i][1]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
