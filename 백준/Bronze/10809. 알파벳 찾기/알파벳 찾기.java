import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] n = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        String S = br.readLine();

        for(int i = 0; i < S.length(); i++) {
            for(int j = 0; j < c.length; j++) {
                if(n[j] == -1 && S.charAt(i) == c[j]) {
                    n[j] = i;
                }
            }
        }

        for(int i = 0; i < n.length; i++) {
            bw.write(n[i] + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}