class Solution {
    private static final int AMERICANO_PRICE = 5500; // 커피값
    
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        // 머쓱이가 최대로 마실 수 있는 아메리카노 잔 수
        answer[0] = money / AMERICANO_PRICE;
        
        // 잔돈
        answer[1] = money - (AMERICANO_PRICE * answer[0]);
        
        return answer;
    }
}