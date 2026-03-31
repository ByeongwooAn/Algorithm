import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        List<Integer> list = new ArrayList<>();
        int avg = 0;

        for(int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int i = 0; i < 5; i++) {
            avg += list.get(i);
        }

        avg /= 5;

        bw.write(String.valueOf(avg) + "\n" + String.valueOf(list.get(2)));

        bw.flush();
        bw.close();
        br.close();
    }
}