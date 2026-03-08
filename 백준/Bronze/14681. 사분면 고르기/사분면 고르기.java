import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());

        System.out.print(x > 0 && y > 0 ? 1 : (x < 0 && y > 0 ? 2 : (x < 0 && y < 0 ? 3 : (x > 0 && y < 0 ? 4 : 0))));
    }
}