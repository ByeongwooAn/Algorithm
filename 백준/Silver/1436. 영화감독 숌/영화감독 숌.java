import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 666;
        
        String n;

        while(count != N) {
            n = String.valueOf(num);

            if(n.contains("666")) {
                count++;
            }

            num++;
        }

        bw.write(String.valueOf(num - 1));

        bw.flush();
        bw.close();
        br.close();
    }
}