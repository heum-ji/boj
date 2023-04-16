import java.util.StringTokenizer;

class Solution {
    public int solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        
        int answer = 0; // 정답
        int prevNum = 0; // 이전 숫자
        
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();

            // Z인 경우 이전 값 빼기
            if ("Z".equals(temp)) {
                answer -= prevNum;
            } else {
                prevNum = Integer.parseInt(temp); // 현재 값 저장
                answer += prevNum;
            }
        }
        
        return answer;
    }
}