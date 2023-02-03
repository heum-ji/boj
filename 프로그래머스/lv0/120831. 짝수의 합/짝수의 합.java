class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = n; i > 1; i--) {
            
            if(i % 2 == 0) { // 짝수인 경우
                answer += i; 
            }
        }
        
        return answer;
    }
}