import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0, num = 0, location = 0;

        for(int i = 1; i <= 9; i++) {
            num = Integer.parseInt(br.readLine());

            if(max < num) {
                max = num;
                location = i;

            }
        }

        bw.write(max + "\n" + location);
        bw.flush();
        bw.close();
        br.close();
    }
}