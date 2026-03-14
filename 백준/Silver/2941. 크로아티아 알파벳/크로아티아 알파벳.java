import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String s = br.readLine();

        int count = 0;

        for(int i = 0; i < s.length() - 1; i++) {
            for(int j = 0; j < croatia.length; j++) {
                if(s.substring(i, i + 2).equals("dz") && i < s.length() - 2) {
                    if(s.substring(i, i + 3).equals(croatia[2])) {
                        count++;
                        s = s.replaceFirst(croatia[2], "0");
                        break;
                    }
                } else {
                    if(s.substring(i, i + 2).equals(croatia[j])) {
                        count++;
                        s = s.replaceFirst(croatia[j], "0");
                        break;
                    }
                }
            }
        }

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '0') {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}