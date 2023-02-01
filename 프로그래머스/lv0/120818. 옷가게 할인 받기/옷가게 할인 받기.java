class Solution {
    // 할인 적용된 가격 구하기
    private static double getDiscountPrice(int price) {
        if (price >= 500000) {
            return price * 0.8;
        } else if (price >= 300000) {
            return price * 0.9;
        } else if (price >= 100000) {
            return price * 0.95;
        } else {
            return price;
        }
    }
    
    public int solution(int price) {
        return (int) getDiscountPrice(price);
    }
}