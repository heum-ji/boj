import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDiff = 100; // 가장 가까운 수(차이가 가장 작은 수)
        
        Arrays.sort(array); // 오름차순 정렬
        
        for (int i = 0; i < array.length; i++) {
            int temp = array[i]; // 현재 정수
            int diff = Math.abs(n - temp); // n과의 차이

            // 가장 가까운 수가 여러개일 경우 더 작은수 리턴
            if (diff == minDiff) {
                continue;
            }

            // 최소 차이 갱신
            if (diff < minDiff) {
                minDiff = diff;
                answer = temp;
            }
        }
        
        return answer;    
    }
}