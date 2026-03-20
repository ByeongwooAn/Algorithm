import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int ten = 0;
        int Nlength = N.length() - 1;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < 10; i++) {
            map.put((char)('0' + i), 0 + i);
        }

        for(int i = 0; i < 26; i++) {
            map.put((char)('A' + i), 10 + i);
        }

        for(int i = 0; i < N.length(); i++) {
            ten += map.get(N.charAt(Nlength)) * pow(i, B);

            Nlength --;
        }

        bw.write(String.valueOf(ten));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int pow(int pow, int B) {
        int result = 1;

        if(pow == 0) {
            return result;
        } else {
            for(int i = 1; i <= pow; i++) {
                result *= B;
            }
        }

        return result;
    }
}