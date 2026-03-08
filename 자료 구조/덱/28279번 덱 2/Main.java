import java.util.Deque;
import java.util.Scanner;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < N; i++) {
            String command = sc.nextLine();

            if(command.startsWith("1")) {
                deque.offerFirst(Integer.parseInt(command.substring(2)));
            }
            else if(command.startsWith("2")) {
                deque.offerLast(Integer.parseInt(command.substring(2)));
            }
            else if(command.equals("3")) {
                sb.append(deque.isEmpty() ? "-1" : deque.pollFirst()).append("\n");
            }
            else if(command.equals("4")) {
                sb.append(deque.isEmpty() ? "-1" : deque.pollLast()).append("\n");
            }
            else if(command.equals("5")) {
                sb.append(deque.size()).append("\n");
            }
            else if(command.equals("6")) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            }
            else if(command.equals("7")) {
                sb.append(deque.isEmpty() ? "-1" : deque.peekFirst()).append("\n");
            }
            else if(command.equals("8")) {
                sb.append(deque.isEmpty() ? "-1" : deque.peekLast()).append("\n");
            }
        }

        System.out.print(sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "");
    }
}