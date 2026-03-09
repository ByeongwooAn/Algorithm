import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        M += C;

        if(M > 59) {
            H += M / 60;
            M %= 60;
        }

        H = H > 24 ? H -= 24 : (H == 24 ? 0 : H);

        System.out.print(H + " " + M);
    }
}