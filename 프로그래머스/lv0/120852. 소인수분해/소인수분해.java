import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        // 루트 n 만큼 반복
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // 나누어 떨어지는 경우 i는 소인수
            while (n % i == 0) {
                list.add(i);
                n /= i;
            }   
        }

        // 소수 + 인수인 경우 추가
        if(n != 1) {
            list.add(n);
        }
        
        // 중복 제거 + 오름차순 정렬
        int[] answer = list.stream().mapToInt(Integer::intValue).distinct().sorted().toArray();
        
        return answer;
    }
}