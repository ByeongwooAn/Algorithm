import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];

        Set<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            set.add(n);
            arrN[i] = n;
        }

        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < list.size(); i++) {
            hash.put(list.get(i), i);
        }

        for(int i = 0; i < arrN.length; i++) {
            if(hash.containsKey(arrN[i])) {
                bw.write(String.valueOf(hash.get(arrN[i])) + " ");
            }
        }


        
        bw.flush();
        bw.close();
        br.close();
    }
}
