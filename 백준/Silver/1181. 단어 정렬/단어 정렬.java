import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, (a, b) -> {
            if(a.length() == b.length()) {
                return a.compareTo(b);
            }

            return a.length() - b.length();
        });

        StringBuilder sb = new StringBuilder();

        for(String s : list) {
            sb.append(s).append("\n");
        }

        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
        br.close();
    }
}