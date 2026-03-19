import java.util.*;
import  java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int max = 0, row = 0, col = 0, num = 0;

        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                num = Integer.parseInt(st.nextToken());

                if(max < num) {
                    max = num;
                    row = i;
                    col = j;
                }
            }
        }

        row++;
        col++;

        bw.write(String.valueOf(max) + "\n" + String.valueOf(row) + " " + String.valueOf(col));

        bw.flush();
        bw.close();
        br.close();
    }
}