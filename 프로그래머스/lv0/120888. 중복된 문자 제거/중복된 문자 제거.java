import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        HashSet<Character> charSet = new HashSet<Character>();
        char[] charArr = my_string.toCharArray();

        for (char c : charArr) {
            if (!charSet.contains(c)) {
                charSet.add(c);
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}