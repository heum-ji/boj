class Solution {
    // 소수 판단
    private static boolean checkPrime(int n) {
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int solution(int n) {
        int answer = 0;
        
        if (n <= 3) {
            return 0;
        }
        
        for (int i = 2; i <= n; i++) {
            if (!checkPrime(i)) {
                answer++;
            }
        }
        
        return answer;
    }
}