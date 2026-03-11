import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> num = new ArrayList<>();

        int answer = 1;

        for(int i = 0; i < 10; i++) {
            num.add(Integer.parseInt(br.readLine()) % 42);
        }

        Collections.sort(num);

        int current = num.get(0);

        for(int next : num) {
            if(current != next) {
                answer++;
                current = next;
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
        br.close();
    }
}