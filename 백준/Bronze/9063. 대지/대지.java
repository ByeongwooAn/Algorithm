import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int answer = 0, maxX = 0, maxY = 0, minX = 0, minY = 0;
        int[][] arr = new int[N][2];

        if(N == 1) {
            st = new StringTokenizer(br.readLine());
            answer = 0;
        } else if(N == 2) {
            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());

                answer = (arr[1][0] - arr[0][0]) * (arr[1][1] - arr[0][1]);
            }
        } else {
            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            for(int i = 1; i < N; i++) {
                if(arr[maxX][0] < arr[i][0]) {
                    maxX = i;
                }

                if(arr[maxY][1] < arr[i][1]) {
                    maxY = i;
                }

                if(arr[minX][0] > arr[i][0]) {
                    minX = i;
                }

                if(arr[minY][1] > arr[i][1]) {
                    minY = i;
                }
            }

            answer = (arr[maxX][0] - arr[minX][0]) * (arr[maxY][1] - arr[minY][1]);

            //System.out.println(arr[maxX][0] + " " + arr[minX][0] + " " + arr[maxY][1] + " " + arr[minY][1]);
        }

        if(answer < 0) {
            answer *= -1;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}