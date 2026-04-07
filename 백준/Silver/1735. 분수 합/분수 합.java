import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int sonA = Integer.parseInt(st.nextToken()); // 분자 A
        int momA = Integer.parseInt(st.nextToken()); // 분모 A

        st = new StringTokenizer(br.readLine());

        int sonB = Integer.parseInt(st.nextToken()); // 분자 B
        int momB = Integer.parseInt(st.nextToken()); // 분모 B

        int sonC = (sonA * momB) + (sonB * momA); // A + B 합 분자
        int momC = momA * momB; // A + B 합 분모
        int num = Math.max(sonC, momC);
        int i = 2;

        while(i < num) {
            if(sonC % i == 0 && momC % i == 0) {
                sonC /= i;
                momC /= i;
            } else {
                i++;
            }
        }

        bw.write(sonC + " " + momC);

        bw.flush();
        bw.close();
        br.close();
    }
}