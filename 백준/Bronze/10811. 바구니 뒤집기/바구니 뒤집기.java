import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = 0, end = 0, temp = 0;

        int[] arr = new int[N + 1];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            if(start != end) {
                for(int j = start; j < end; j++, end--) {
                    temp = arr[j];
                    arr[j] = arr[end];
                    arr[end] = temp;
                }
            }
        }

        for(int i = 1; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}