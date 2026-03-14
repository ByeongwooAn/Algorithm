import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        float total = 0; // 전공평점
        int scoreSum = 0;;

        for(int T = 0; T < 20; T++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken(); // 과목명 버림

            float score = Float.parseFloat(st.nextToken()); // 학점
            String rank = st.nextToken(); // 등급

            switch(rank) {
                case "A+":
                    total += score * 4.5;
                    scoreSum += score;
                    break;

                case "A0":
                    total += score * 4.0;
                    scoreSum += score;
                    break;

                case "B+":
                    total += score * 3.5;
                    scoreSum += score;
                    break;

                case "B0":
                    total += score * 3.0;
                    scoreSum += score;
                    break;

                case "C+":
                    total += score * 2.5;
                    scoreSum += score;
                    break;

                case "C0":
                    total += score * 2.0;
                    scoreSum += score;
                    break;

                case "D+":
                    total += score * 1.5;
                    scoreSum += score;
                    break;

                case "D0":
                    total += score * 1.0;
                    scoreSum += score;
                    break;

                case "F":
                    total += score * 0.0;
                    scoreSum += score;
                    break;

                default:
                    break;
                
            }
        }

        bw.write(String.valueOf(total / scoreSum));

        bw.flush();
        bw.close();
        br.close();
    }
}