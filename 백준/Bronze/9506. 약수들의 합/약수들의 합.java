import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = 0;
        StringBuilder sb = new StringBuilder();

        while(true) {
            n = Integer.parseInt(br.readLine());

            StringBuilder sb2 = new StringBuilder();

            if(n == -1) {
                break;
            }

            int sum = 0;

            sb2.append(n);
            sb2.append(" = ");

            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    sum += i;
                    sb2.append(i);
                    sb2.append(" + ");
                }
            }

            sb2.append("\n");
            sb2.delete(sb2.length() - 4, sb2.length() - 2);

            if(sum == n) {
                sb.append(sb2.toString());
            } else {
                sb.append(n);
                sb.append(" is NOT perfect.\n");
            }
        }

        if(!sb.isEmpty()) {
            sb.delete(sb.length() - 1, sb.length());
            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}