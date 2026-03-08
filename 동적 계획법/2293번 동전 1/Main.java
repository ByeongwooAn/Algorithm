import java.util.Stack;

class Solution {
    public static void main(String[] args) {        
        String[] Action = {"b", "CL", "i", "a", "CL", "c", "k"};
        int N = Action.length;

        System.out.print(solution(N, Action));

    }
    public static String solution(int N, String[] Action) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        String answer;

        boolean capsLock = false;

        for(int i = 0; i < N; i++) {
            if(capsLock == true) {
                stack.push(Action[i].toUpperCase());
            } else {
                stack.push(Action[i]);
            }

            if(Action[i].equals("CL")) {
                capsLock = !capsLock;
                stack.pop();
            }

            if(stack.size() < 2 && Action[i].equals("BS")) {
                stack.pop();
            }
            else if(Action[i].equals("BS")) {
                stack.pop();
                stack.pop();
            }
        }

        for(int i = 0; i < stack.size(); i++) {
            sb.append(stack.elementAt(i));
        }

        answer = sb.toString();

        System.out.println(stack.lastElement().equals("k"));

        return answer;
    }
}