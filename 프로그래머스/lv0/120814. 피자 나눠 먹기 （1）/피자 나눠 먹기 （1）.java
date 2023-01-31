class Solution {
    public int solution(int n) {
        int quotient = n / 7; // 몫
        int remainder = n % 7; // 나머지
        
        // 몫이 0인경우 항상 1
        if(quotient == 0) {
            return 1;
        } else { // 몫이 0이 아닌 경우
            // 나머지가 0인 경우 : 몫
            // 나머지가 0이 아닌경우 : 몫 + 1
            return remainder == 0 ? quotient : quotient + 1;
        }
    }
}