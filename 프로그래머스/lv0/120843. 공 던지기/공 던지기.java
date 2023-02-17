class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int curIndex = 0; // 현재 인덱스
        int length = numbers.length; // 초기화 길이
        
        // k만큼 반복
        for (int i = 0; i < k; i++) {
            answer = numbers[curIndex]; // 현재 던지는 사람 번호
            
            curIndex += 2; // 1명 건너뛰기

            if(curIndex >= length) { // 마지막 사람인 경우 현재 인덱스 나머지 값으로 초기화
                curIndex %= length;
            }
        }
        return answer;
    }
}