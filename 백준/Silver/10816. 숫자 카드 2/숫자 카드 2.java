import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 카드의 개수
        st = new StringTokenizer(br.readLine());

        int[] arrN = new int[N]; // 상근이가 가지고 있는 숫자 카드

        // 상근이의 숫자 카드 입력
        for(int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrN); // 상근이의 카드 정렬

        int M = Integer.parseInt(br.readLine()); // 비교할 숫자 카드의 개수
        st = new StringTokenizer(br.readLine());

        int[] arrM = new int[M]; // 비교할 숫자 카드

        // 비교할 숫자 카드 입력
        for(int i = 0; i < M; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        int target = 0; // 찾아야 하는 숫자
        int count = 0; // 숫자 카드의 개수

        StringBuilder sb = new StringBuilder(); // 정답을 저장할 StringBuilder

        // 카드 비교
        for(int i = 0; i < M; i++) {
            target = arrM[i];
            count = upperBound(arrN, target) - lowerBound(arrN, target);
            sb.append(count).append(" ");
            count = 0;
        }

        sb.delete(sb.length() - 1, sb.length()); // 마지막 공백 삭제

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    public static int upperBound(int[] arrN, int target) {
        int left = 0;
        int right = arrN.length;
        
        while(left < right) {
            int mid = (left + right) / 2;

            if(arrN[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static int lowerBound(int[] arrN, int target) {
        int left = 0;
        int right = arrN.length;
        
        while(left < right) {
            int mid = (left + right) / 2;

            if(arrN[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}