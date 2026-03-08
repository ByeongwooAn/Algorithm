import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int oneCount = 0;

        boolean stackCheck = false;

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            if(A[i] == 0) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else {
                st.nextToken();
                oneCount++;
                stackCheck = oneCount == N ? true : false;
            }
        }

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++) {
            if(stackCheck) {
                sb.append(Integer.parseInt(st.nextToken())).append(" ");
            }
            else if(!stack.isEmpty()) {
                sb.append(stack.pop()).append(" ");
            } else {
                sb.append(Integer.parseInt(st.nextToken())).append(" ");
            }
        }

        System.out.print(sb.toString().trim());
    }
}