class Solution {
    public String solution(String my_string) {
        char[] charArr = my_string.toCharArray(); // 문자열 -> 문자
        char[] vowels = {'a', 'e', 'i', 'o', 'u'}; // 모음
        String answer = "";
        
        for (char myStr : charArr) {
            boolean isVowel = false; // 모음 판단
            // 모음 필터
            for (char vowel : vowels) {
                if (myStr == vowel) { // 모음인 경우
                    isVowel = true;
                    break;
                }
            }
            
            // 모음이 아닌 경우
            if (!isVowel) {
                answer += myStr;
            }
        }
        return answer;
    }
}