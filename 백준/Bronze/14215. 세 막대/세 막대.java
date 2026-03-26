import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> stick = new ArrayList<>();

        stick.add(Integer.parseInt(st.nextToken()));
        stick.add(Integer.parseInt(st.nextToken()));
        stick.add(Integer.parseInt(st.nextToken()));

        Collections.sort(stick);

        int a = stick.get(0);
        int b = stick.get(1);
        int c = stick.get(2);

        if((a == b && a == c && b == c) || a + b > c) {
            bw.write(String.valueOf(a + b + c));
        } else {
            c -= c - (a + b) + 1 < 0 ? (c - (a + b) + 1) * -1 : c - (a + b) + 1;

            bw.write(String.valueOf(a + b + c));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}