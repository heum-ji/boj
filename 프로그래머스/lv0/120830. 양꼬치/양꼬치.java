class Solution {
    private static final int N_PRICE = 12000; // 양꼬치 가격
    private static final int K_PRICE = 2000;  // 음료수 가격
    
    public int solution(int n, int k) {
        int answer = 0;
        int servicePrice = n / 10 * K_PRICE; // 음료수 서비스 가격
        
        return n * N_PRICE + k * K_PRICE - servicePrice;
    }
}