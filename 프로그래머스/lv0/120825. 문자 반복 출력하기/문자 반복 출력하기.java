class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        char[] charArr = my_string.toCharArray();

        for (char c : charArr) {
            answer.append(String.valueOf(c).repeat(n));
        }
        
        return answer.toString();
    }
}