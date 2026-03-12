import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[][] dial = {
            {' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' '},
            {'A', 'B', 'C', ' '},
            {'D', 'E', 'F', ' '},
            {'G', 'H', 'I', ' '},
            {'J', 'K', 'L', ' '},
            {'M', 'N', 'O', ' '},
            {'P', 'Q', 'R', 'S'},
            {'T', 'U', 'V', ' '},
            {'W', 'X', 'Y', 'Z'},
        };

        String S = br.readLine();
        int sum = 0;

        for(int i = 0; i < S.length(); i++) {
            for(int j = 2; j <= 9; j++) {
                for(int k = 0; k < 4; k++) {
                    if(S.charAt(i) == dial[j][k]) {
                        sum += j + 1;
                    }
                }
            }
        }

        bw.write(String.valueOf(sum));
        
        bw.flush();
        bw.close();
        br.close();
    }
}