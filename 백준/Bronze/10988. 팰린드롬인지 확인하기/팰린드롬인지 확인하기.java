import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        int answer = 0;

        for(int i = 0; i < len / 2 + 1; i++) {
            if(str.charAt(i) != str.charAt((len - 1) - i)) {
                answer = 0;
                break;
            } else {
                answer = 1;
            }
        }

        System.out.print(answer);
    }
}