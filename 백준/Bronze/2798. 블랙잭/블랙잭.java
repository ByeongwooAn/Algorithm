import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;

        st = new StringTokenizer(br.readLine());

        int[] card = new int[N];

        for(int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        start:
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < N; k++) {
                    if(i != j && i != k && j != k) {
                        answer = card[i] + card[j] + card[k] <= M ? Math.max(card[i] + card[j] + card[k], answer) : answer;

                        if(answer == M) {
                            break start;
                        }
                    }
                }
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
        br.close();
    }
}