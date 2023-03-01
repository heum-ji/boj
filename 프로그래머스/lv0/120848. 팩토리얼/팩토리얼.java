class Solution {
    private static int getFactorial(int n) {
        if (n <= 1) {
           return 1; 
        }
        return n * getFactorial(n - 1);
    }
    
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 10; i > 0; i--) {
            int tempX = getFactorial(i);
            
            if (tempX <= n) {
                return i;
            }
        }
        
        return answer;
    }
}