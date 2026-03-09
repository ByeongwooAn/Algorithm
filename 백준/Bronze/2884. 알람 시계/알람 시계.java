import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M < 45) {
            M = 60 - (45 - M);
            H -= 1;
        } else {
            M -= 45;
        }

        if(H < 0) {
            H = 24 + H;
        }

        System.out.print(H + " " + M);
    }
}