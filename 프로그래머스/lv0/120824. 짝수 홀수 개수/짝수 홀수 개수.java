class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for (int j : num_list) {
            if (j % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        
        return answer;
    }
}