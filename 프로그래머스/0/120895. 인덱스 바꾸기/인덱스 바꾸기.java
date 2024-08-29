class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] tempCharArr = my_string.toCharArray();
        
        tempCharArr[num1] = my_string.charAt(num2);
        tempCharArr[num2] = my_string.charAt(num1);
        
        return String.valueOf(tempCharArr);
    }
}