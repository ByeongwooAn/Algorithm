import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int k = 2;

        for(int i = 0; i < 2 * N - 1; i++) {
            for(int j = 0; j < 2 * N - 1; j++) {
                if(i <= N - 1) {
                    if(i == 0 && j == N - 1) {
                        bw.write("*");
                        break;
                    } else {
                        if(j == N - 1 || j >= N - 1 - i && j <= N - 1 + i) {
                            bw.write("*");
                        } else if(N - 1 + i < j){
                            break;
                        } else {
                            bw.write(" ");
                        }
                    }
                } else {
                    if(j == N - 1 || (N - 1 - i) * -1 <= j && j <= N - 1 + i - k) {
                        bw.write("*");
                    } else if(N - 1 + i - k < j) {
                        break;
                    } else {
                        bw.write(" ");
                    }
                }
            }

            if(i > N - 1) {
                k += 2;
            }

            if(i < 2 * N - 2) {
                bw.newLine();
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}