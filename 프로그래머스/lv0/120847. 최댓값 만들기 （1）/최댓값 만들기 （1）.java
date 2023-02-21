import java.util.Arrays;
import java.util.Collections;

class Solution {
    
    public int solution(int[] numbers) {
        Integer[] numbersArr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        
        Arrays.sort(numbersArr, Collections.reverseOrder());
        
        return numbersArr[0] * numbersArr[1];
    }
}