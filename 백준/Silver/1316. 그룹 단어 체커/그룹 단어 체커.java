import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        String s;

        // 테스트 케이스 시작
        for(int i = 0; i < N; i++) {
            s = br.readLine();

            List<Character> list = new ArrayList<>();
            list.add(s.charAt(0));

            // 단어를 한 글자씩 list에 추가
            for(int j = 0; j < s.length() - 1; j++) {
                if(s.charAt(j) != s.charAt(j + 1)) {
                    list.add(s.charAt(j + 1));
                }
            }

            boolean duplicationCheck = true;

            if(list.size() == 1) {
                duplicationCheck = true;
            } else {
                // 단어 검사 시작
                for(int j = 0; j < list.size(); j++) {
                    for(int k = 0; k < list.size(); k++) {
                        if(j == k) {
                            continue;
                        } else if(list.get(j) == list.get(k)) {
                            duplicationCheck = false;
                            break;
                        }
                    }

                    if(!duplicationCheck) {
                        break;
                    }
                }
            }

            if(duplicationCheck) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}