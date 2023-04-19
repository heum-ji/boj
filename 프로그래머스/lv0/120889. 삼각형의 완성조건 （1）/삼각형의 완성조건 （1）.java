import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int sum = 0;
        
        Arrays.sort(sides); // 오름차순 정렬
        
        sum = sides[0] + sides[1]; // 다른 두 변의 길이의 합
        
        // 삼각형 성립 여부 판단
        if (sides[2] < sum) {
            return 1;
        } else {
            return 2;
        }
    }
}