class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];
        
        // 홀수 체크
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) { // 홀수 이면
                answer[i / 2] = i;
            }
        }
        
        return answer;
    }
}