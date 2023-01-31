class Solution {
    // 최대 공약수 - 유클리드 호제법 (a > b)
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    
    public int solution(int n) {
        int maxNum = Math.max(n, 6); // 큰 수
        int minNum = (n == maxNum) ? 6 : n; // 작은 수
        int gcd = gcd(maxNum, minNum); // 최대공약수
        
        return n / gcd;
    }
    
    
}