import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {        
        int count = 0; // 맞춘 문제 수        
        int maxScore = 0; // 가장 높은 점수
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 수포자 패턴
        int[][] supoja = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        }; 
        
        // 수포자 점수
        int[] scores = new int[3];
               
        // 문제 정답 탐색
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < supoja.length; j++) {
                if (answers[i] == supoja[j][i % supoja[j].length]) {
                    scores[j]++;
                }
            }
        }
        
        // 가장 높은 점수 저장
        maxScore = Arrays.stream(scores).max().getAsInt();
        
        // 가장 높은 점수를 가진 수포자 조회
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}