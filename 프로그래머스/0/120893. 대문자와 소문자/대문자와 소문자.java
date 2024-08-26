class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        char tempChar = ' ';

        for (int i = 0; i < my_string.length(); i++) {
            tempChar = my_string.charAt(i);

            if (Character.isUpperCase(tempChar)) {
                answer.append(Character.toLowerCase(tempChar));
            } else {
                answer.append(Character.toUpperCase(tempChar));
            }
        }
        
        return answer.toString();
    }
}