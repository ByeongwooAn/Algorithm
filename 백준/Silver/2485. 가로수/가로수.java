import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];

        for(int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(br.readLine());
        }

        int gap = arrN[1] - arrN[0];

        for(int i = 2; i < N; i++) {
            gap = gcd(gap, arrN[i] - arrN[i - 1]);
        }

        int total = (arrN[N - 1] - arrN[0]) / gap + 1;

        bw.write(String.valueOf(total - N));

        bw.flush();
        bw.close();
        br.close();
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}