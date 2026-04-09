import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for(int m = M; m <= N; m++) {
            if(isPrime(m)) {
                sb.append(m).append("\n");
            }
        }

        sb.delete(sb.length() - 1, sb.length());

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isPrime(int m) {
        boolean prime = false;
        int count = 0;

        if(m == 1) {
            return prime;
        }

        for(int i = 2; i <= Math.sqrt(m); i++) {
            if(m % i == 0) {
                count++;
                break;
            }
        }

        if(count == 0) {
            prime = true;
            return prime;
        }

        return prime;
    }
}