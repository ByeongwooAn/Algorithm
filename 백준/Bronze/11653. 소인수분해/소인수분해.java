import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int i = 2;

        StringBuilder sb = new StringBuilder();

        if(N != 1) {
            while(N > 1) {
                if(N % i == 0) {
                    N = N / i;
                    sb.append(i);
                    sb.append("\n");
                } else {
                    i++;
                }
            }
            
            sb.delete(sb.length() - 1, sb.length());
            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}