class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int x = box[0] / n; // 가로 최댓값
        int y = box[1] / n; // 세로 최댓값
        int h = box[2] / n; // 높이 최댓값
        
        
        return x * y * h;
    }
}