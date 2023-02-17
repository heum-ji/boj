class Solution {
    public int[][] solution(int[] num_list, int n) {
        int rows = num_list.length / n; // 행
        int[][] answer = new int[num_list.length / n][n];
        int curIndex = 0; // num_list 현재 피벗
        
        for (int i = 0; i < rows; i++) { // 행 반복
            
            for (int j = 0; j < n; j++) { // 열 반복
                answer[i][j] = num_list[curIndex++];
            }
        }
        return answer;
    }
}