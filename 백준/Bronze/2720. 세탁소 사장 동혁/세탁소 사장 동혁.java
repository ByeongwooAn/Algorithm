import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int C = 0;

        for(int i = 0; i < T; i++) {
            C = Integer.parseInt(br.readLine());
            int quarter = 0, dime = 0, nickel = 0, penny = 0;

            // 1달러는 100센트
            while(C > 0) {
                if(C >= 25) {
                    // 쿼터는 25센트
                    C -= 25;
                    quarter++;
                } else if(C >= 10) {
                    // 다임은 10센트
                    C -= 10;
                    dime++;
                } else if(C >= 5) {
                    // 니켈은 5센트
                    C -= 5;
                    nickel++;
                } else {
                    // 페니는 1센트
                    C -= 1;
                    penny++;
                }
            }
            bw.write(quarter + " " + dime + " " + nickel + " " + penny);

            if(i < T - 1) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}