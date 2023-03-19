import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String my_string) {
        String numStr = my_string.replaceAll("[^0-9]", ""); // 0~9가 아닌 값은 제거
        // 문자열 -> int[] 변환 및 정렬
        int[] answer = Stream.of(numStr.split("")).mapToInt(Integer::parseInt).sorted().toArray(); 
        
        return answer;
    }
}