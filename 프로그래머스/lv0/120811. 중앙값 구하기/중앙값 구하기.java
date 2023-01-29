import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // 오름차순 정렬
        Arrays.sort(array);
        
        // 중앙값 구하기      
        return array[array.length / 2];
    }
}