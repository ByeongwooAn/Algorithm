import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int last = 0;
        int N = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < N; i++) {
            String op = sc.nextLine();
            
            if(op.equals("pop")) {
                sb.append(queue.isEmpty() ? "-1" : queue.poll()).append("\n");
            }
            else if(op.equals("size")) {
                sb.append(queue.size()).append("\n");
            }
            else if(op.equals("empty")) {
                sb.append(queue.isEmpty() ? "1" : "0").append("\n");
            }
            else if(op.equals("front")) {
                sb.append(queue.isEmpty() ? "-1" : queue.peek()).append("\n");
            }
            else if(op.equals("back")) {
                sb.append(queue.isEmpty() ? "-1" : last).append("\n");
            }
            else if(op.startsWith("push")) {
                last = Integer.parseInt(op.substring(5));
                queue.offer(last);
            }
        }
        
        System.out.print(sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "");
    }
}
