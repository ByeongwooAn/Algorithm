import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < K; i++) {
            int money = Integer.parseInt(br.readLine());

            if(money == 0) {
                sum = sum - stack.pop();
            } else {
                stack.push(money);
                sum = sum + money;
            }
        }

        System.out.print(sum);

    }
}