import java.util.Scanner;

public class Main {

    static int[][] memo = new int[41][2]; // N은 최대 40이므로 충분한 크기로 설정

    public static void fibonacci(int N) {
        if (N == 0) {
            memo[0][0] = 1; // 0 호출 횟수
            memo[0][1] = 0; // 1 호출 횟수
            return;
        } 
        if (N == 1) {
            memo[1][0] = 0;
            memo[1][1] = 1;
            return;
        }

        if (memo[N][0] == 0 && memo[N][1] == 0) { // 아직 계산되지 않은 경우
            fibonacci(N - 1);
            fibonacci(N - 2);
            memo[N][0] = memo[N - 1][0] + memo[N - 2][0];
            memo[N][1] = memo[N - 1][1] + memo[N - 2][1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수 입력

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            fibonacci(N); // N에 대한 0과 1의 호출 횟수 계산
            System.out.println(memo[N][0] + " " + memo[N][1]);
        }

        sc.close();
    }
}