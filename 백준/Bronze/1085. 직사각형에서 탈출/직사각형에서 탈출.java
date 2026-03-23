import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int num1 = x <= w / 2 ? x : (x <= w ? w - x : x - w);
        int num2 = y <= h / 2 ? y : (y <= h ? h - y : y - h);

        int answer = Math.min(num1, num2);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}