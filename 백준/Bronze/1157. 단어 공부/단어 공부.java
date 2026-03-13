import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 알파벳 정의
        char[][] a = {
            {65, 0}, {66, 0}, {67, 0}, {68, 0}, {69, 0},
            {70, 0}, {71, 0}, {72, 0}, {73, 0}, {74, 0},
            {75, 0}, {76, 0}, {77, 0}, {78, 0}, {79, 0},
            {80, 0}, {81, 0}, {82, 0}, {83, 0}, {84, 0},
            {85, 0}, {86, 0}, {87, 0}, {88, 0}, {89, 0},
            {90, 0} 
        };

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < a.length; j++) {
                if(s.charAt(i) == a[j][0] || s.charAt(i) == a[j][0] + 32) {
                    a[j][1] += 1;
                    break;
                }
            }
        }

        int max = a[0][1];
        int check = 0, duplication = 0;

        for(int i = 1; i < a.length; i++) {
            if(max < a[i][1]) {
                max = a[i][1];
                check = i;
            }
        }

        for(int i = 0; i < a.length; i++) {
            if(max == a[i][1]) {
                duplication++;
            }
        }

        if(duplication >= 2) {
            bw.write('?');
        } else {
            bw.write(a[check][0]);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}