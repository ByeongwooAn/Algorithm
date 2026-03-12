import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0;
        String s;

        while(st.hasMoreTokens()) {
            s = st.nextToken();
            i++;
        }

        bw.write(String.valueOf(i));
        
        bw.flush();
        bw.close();
        br.close();
    }
}