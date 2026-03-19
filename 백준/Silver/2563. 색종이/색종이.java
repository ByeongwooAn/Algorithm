import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[100][100];

        int x = 0, y = 0, sum = 0;;

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    if(arr[j][k] != 1) {
                        arr[j][k] = 1;
                        sum++;
                    }
                }
            }
        }

        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
        br.close();
    }
}