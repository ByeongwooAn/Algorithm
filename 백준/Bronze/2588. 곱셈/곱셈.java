import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int num2 = Integer.parseInt(st.nextToken());

        System.out.println(num1 * (num2 % 10));
        System.out.println(num1 * (num2 / 10 % 10));
        System.out.println(num1 * (num2 / 100));
        System.out.print(num1 * num2);
    }
}