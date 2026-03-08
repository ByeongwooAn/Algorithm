import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < N; i++) {
            String command = sc.nextLine();

            if(command.startsWith("1")) {
                stack.push(Integer.parseInt(command.substring(2)));
            }
            else if(command.equals("2")) {
                sb.append(stack.isEmpty() ? "-1" : stack.pop()).append("\n");
            }
            else if(command.equals("3")) {
                sb.append(stack.size()).append("\n");
            }
            else if(command.equals("4")) {
                sb.append(stack.isEmpty() ? "1" : "0").append("\n");
            }
            else if(command.equals("5")) {
                sb.append(stack.isEmpty() ? "-1" : stack.peek()).append("\n");
            }
        }

        System.out.print(sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "");
    }
}