import java.util.stream.Stream;

class Solution {
    public int solution(String my_string) {
        String numStr = my_string.replaceAll("[^0-9]", ""); // 0~9 필터
        
        return Stream.of(numStr.split("")).mapToInt(Integer::parseInt).sum();
    }
}