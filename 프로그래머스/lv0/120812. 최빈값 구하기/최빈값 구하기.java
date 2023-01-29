class Solution {
    public int solution(int[] array) {
        int answer = -1;                    // return 값
        int maxCnt = 0;                     // 최빈값
        int[] resultArr = new int[1000];    // 최빈값 저장용 배열
        boolean isDuplicate = false;        // 최빈값 중복 여부
        
        // 최빈값 추출
        for (int i = 0; i < array.length; i++) {
            int x = array[i]; // 현재 비교 값
            int tempMax = ++resultArr[x];

            // 최빈값 갱신
            if (tempMax > maxCnt) {
                maxCnt = tempMax;
            }
        }
        
        // answer 처리
        for (int i = 0; i < resultArr.length; i++) {
            if (resultArr[i] == maxCnt) { // 최빈값인 경우
                if (isDuplicate) { // 중복 O
                    answer = -1;
                    break;
                } else { // 중복 X
                    isDuplicate = true;
                    answer = i;
                }
            }
        }
        return answer;
    }
}