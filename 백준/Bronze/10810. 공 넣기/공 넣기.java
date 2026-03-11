import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int i = 0, j = 0, k = 0;

        int[] arr = new int[N + 1];

        while(M > 0) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            for(int num = i; num <= j; num++) {
                arr[num] = k;
            }

            M--;
        }

        for(int num1 = 1; num1 < arr.length; num1++) {
            bw.write(arr[num1] + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}