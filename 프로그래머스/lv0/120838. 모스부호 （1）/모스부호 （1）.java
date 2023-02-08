import java.util.StringTokenizer;

class Solution {
    public String solution(String letter) {
        StringTokenizer st = new StringTokenizer(letter); // letter 알파벳 분리
        StringBuilder sb = new StringBuilder();
        
        // 모스부호
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        while (st.hasMoreTokens()) {
            String str = st.nextToken();

            for (int i = 0; i < morse.length; i++) {
                if (str.equals(morse[i])) {
                    sb.append((char) (i + 'a'));
                }
            }
        }
        
        return sb.toString();
    }
}