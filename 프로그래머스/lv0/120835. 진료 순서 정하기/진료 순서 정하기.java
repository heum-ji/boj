import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        Integer[] tempArr = Arrays.stream(emergency).boxed().toArray(Integer[]::new); // int -> Integer 변환
        int[] answer = new int[emergency.length]; // 정답용 배열
        
        Arrays.sort(tempArr, Collections.reverseOrder()); // 내림차순 정렬
        
        for (int i = 0; i < emergency.length; i++) {
            
            for(int j = 0; j < tempArr.length; j++) {
                // 응급도의 크기 순서 번호 찾기
                if (emergency[i] == tempArr[j]) {
                    answer[i] = j + 1; // 응급도의 크기 index
                }
            }
            
        }
        
        return answer;
    }
}