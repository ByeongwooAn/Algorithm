import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        StringBuilder sb = new StringBuilder();

        for(int t = 0; t < T; t++) {
            long n = Long.parseLong(br.readLine());

            sb.append(minPrime(n)).append("\n");
        }

        sb.delete(sb.length() - 1, sb.length());

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    public static long minPrime(long n) {
        if(n == 0 || n == 1) {
            return 2;
        }
        
        while(true) {
            int count = 0;

            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    n++;
                    count++;
                    break;
                }
            }

            if(count == 0) {
                break;
            }
        }

        return n;
    }
}