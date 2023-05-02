class Solution {
    public int solution(int order) {    
        String strOrder = String.valueOf(order); // int -> String 변환
        
        int prevOrderLength = strOrder.length(); // 처음 문자열 길이
        int nextOrderLength = strOrder.replaceAll("[369]", "").length(); // 3, 6, 9 제외 길이
        
        return prevOrderLength - nextOrderLength;
    }
}