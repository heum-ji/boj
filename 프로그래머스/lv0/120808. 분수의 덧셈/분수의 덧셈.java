class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 분수 통분
        int numer3 = denom2 * numer1 + denom1 * numer2; // 분자
        int denom3 = denom1 * denom2; // 분모
        int maxNum = 1; // 최대공약수
        
        // 분모를 분자로 나눌 수 있는 경우
        if (denom3 % numer3 == 0) {
            denom3 /= numer3;
            
            answer[0] = 1;
            answer[1] = denom3;
            
            return answer;
        }
        
        // 최대공약수 구하기 (기약 분수)
        for(int i = 1; i <= numer3; i++) {
            // 둘 다 나누어 지는 경우
            if(numer3 % i == 0 && denom3 % i == 0) {
                maxNum = i;
            }
        }
        
        answer[0] = numer3 / maxNum;
        answer[1] = denom3 / maxNum;
        
        return answer;
    }
}