import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int temp = 0, bag1 = 0, bag2 = 0;

        int[] arr = new int[N + 1];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            bag1 = Integer.parseInt(st.nextToken());
            bag2 = Integer.parseInt(st.nextToken());

            temp = arr[bag1];
            arr[bag1] = arr[bag2];
            arr[bag2] = temp;
        }
        
        for(int i = 1; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}