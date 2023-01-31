class Solution {    
    public int solution(int slice, int n) {
        int maxNum = Math.max(n, slice); // 큰 수
        int minNum = (n == maxNum) ? slice : n; // 작은 수
        int answer = 1;
        
        while((slice * answer) < n) {
            answer++;
        }
        
        return answer;
    }
}