import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0, min = 0;;
        boolean first = false;

        for(int i = M; i <= N; i++) {
            int count = 0;

            for(int j = 1; j < Math.sqrt(i); j++) {
                if(i % j == 0) {
                    count++;
                }

                if((j + 1) * (j + 1) == i) {
                    count++;
                }
            }

            if(count == 1 && first == false) {
                min = i;
                first = true;
            }

            if(count == 1) {
                sum += i;
            }
        }

        if(sum == 0 && min == 0) {
            bw.write(String.valueOf(-1));    
        } else {
            bw.write(String.valueOf(sum) + "\n" + String.valueOf(min));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}