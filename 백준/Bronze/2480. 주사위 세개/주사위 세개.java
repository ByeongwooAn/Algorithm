import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A == B && B == C) {
            System.out.print(10000 + A * 1000);
        } else if(A == B || B == C || A == C) {

            System.out.print(A == B || A == C ? 1000 + A * 100 : 1000 + B * 100);
        } else {
            System.out.print(Math.max(Math.max(A, B), C) * 100);
        }
    }
}