import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int count;

        for(int i = 0; i < T; i++) {
            String vps = br.readLine();
            count = 0;

            for(int j = 0; j < vps.length(); j++) {
                if(count < 0) {
                    break;
                }

                count = count + (vps.charAt(j) == '(' ? 1 : -1);
            }

            if(count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}