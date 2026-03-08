import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 물건의 개수
        int K = sc.nextInt(); // 배낭의 용량
        
        int [] W = new int[N];
        int [] V = new int[N];

        int [][] dp = new int[N + 1][K + 1];

        for(int i = 0; i < N; i++) {
            W[i] = sc.nextInt(); // 물건 i의 무게
            V[i] = sc.nextInt(); // 물건 i의 가치
        }

        for(int n = 1; n <= N; n++) {
            for(int k = 0; k <= K; k++) {
                if(W[n - 1] <= k) {
                    dp[n][k] = Math.max(dp[n - 1][k], V[n - 1] + dp[n - 1][k - W[n - 1]]);
                } else {
                    dp[n][k] = dp[n - 1][k];
                }
            }
        }

        System.out.print(dp[N][K]);

        sc.close();
    }
}