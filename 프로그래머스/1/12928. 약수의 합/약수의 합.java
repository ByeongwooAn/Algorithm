class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= Math.sqrt(n); i++) {
            System.out.println(i);
            if(i ==  n / i && n % i == 0) {
                answer += i;
            } else if(n % i == 0) {
                answer += (i + n / i);
            }
            //System.out.println(answer);
        }
        
        return answer;
    }
}