class Solution {
    public String solution(int age) {
        char[] tempArr = String.valueOf(age).toCharArray(); // 한글자씩 분리
        StringBuilder sb = new StringBuilder();
        
        for (char c : tempArr) {
            sb.append((char) (c + 49));
        }
        
        return sb.toString();
    }
}