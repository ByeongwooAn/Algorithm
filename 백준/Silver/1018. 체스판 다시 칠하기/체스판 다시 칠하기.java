import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count1 = 0, count2 = 0, num = 0, min1 = 50, min2 = 50;

        char[][] chess = new char[N][M];
        char[][] chess1 = new char[8][8];
        char[][] chess2 = new char[8][8];

        for(int i = 0; i < N; i++) {
             String s = br.readLine();

            for(int j = 0; j < s.length(); j++) {
                chess[i][j] = s.charAt(j);
            }
        }

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                chess1[i][j] = j % 2 == num ? 'B' : 'W';
                chess2[i][j] = j % 2 == num ? 'W' : 'B';
            }

            num = num == 0 ? 1 : 0;
        }

        if(N == 8 && M == 8) {
            for(int i = 0; i < 8; i++) {
                for(int j = 0; j < 8; j++) {
                    if(chess[i][j] != chess1[i][j]) {
                        count1++;
                    }

                    if(chess[i][j] != chess2[i][j]) {
                        count2++;
                    }
                }
            }

            bw.write(String.valueOf(Math.min(count1, count2)));
        } else {
            for(int i = 0; i <= N - 8; i++) {
                for(int j = 0; j <= M - 8; j++) {
                    for(int k = 0; k < 8; k++) {
                        for(int l = 0; l < 8; l++) {
                            if(chess[i + k][j + l] != chess1[k][l]) {
                                count1++;
                            }

                            if(chess[i + k][j + l] != chess2[k][l]) {
                                count2++;
                            }
                        }
                    }

                    min1 = Math.min(min1, count1);
                    min2 = Math.min(min2, count2);

                    count1 = 0;
                    count2 = 0;
                }
            }

            bw.write(String.valueOf(Math.min(min1, min2)));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}