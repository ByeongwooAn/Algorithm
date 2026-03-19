import  java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        char[][] arr = new char[5][15];

        for(int i = 0; i < 5; i++) {
            s = br.readLine();
            for(int j = 0; j < 15; j++) {
                if(j < s.length()) {
                    arr[i][j] = s.charAt(j);
                } else {
                    arr[i][j] = ' ';
                }
            }
        }

        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(arr[j][i] == ' ') {
                    continue;
                }
                
                bw.write(arr[j][i]);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}