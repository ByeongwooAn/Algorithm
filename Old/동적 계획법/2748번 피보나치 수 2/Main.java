import java.util.Scanner;

public class Main {
    static long [] memo;

    public static long fibo(int n) {
        if(n < 2) {
            return n;
        }

        if(memo[n] != -1) {
            return memo[n];
        }
        
        memo[n] = fibo(n - 1) + fibo(n - 2);

        return memo[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        memo = new long[n + 1];

        memo[0] = 0;
        memo[1] = 1;

        for(int i = 2; i < n + 1; i++) {
            memo[i] = -1;
        }

        System.out.print(fibo(n));

        sc.close();
    }
}