import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int i = 1, j = 1, num = 1;
        boolean turn = false;

        while(N != num) {
            num++;

            if(turn == false && i == 1) {
                turn = !turn;
                j++;
            } else if(turn == true && j == 1) {
                turn = !turn;
                i++;
            } else if(i >= 1 && j > 1 && turn == true) {
                i++;
                j--;
            } else if(j >= 1 && i > 1 && turn == false) {
                i--;
                j++;
            }
        }

        bw.write(i + "/" + j);

        bw.flush();
        bw.close();
        br.close();
    }
}