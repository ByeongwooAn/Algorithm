import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String srtn = String.valueOf(n);
        
        List<Long> N = new ArrayList<>();
        
        for(int i = 0; i < srtn.length(); i++) {
            N.add(n % 10);
            n /= 10;
        }
        
        Collections.sort(N, Collections.reverseOrder());
        
        for(long num : N) {
            answer = answer * 10 + num;
        }
        
        return answer;
    }
}