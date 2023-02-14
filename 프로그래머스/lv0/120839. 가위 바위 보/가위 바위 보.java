class Solution {
    private static final String SCISSORS = "2";  // 가위
    private static final String ROCK = "0";      // 바위
    private static final String PAPER = "5";     // 보
    
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        String[] rspArr = rsp.split("");
        
        for (String rspStr : rspArr) {
            switch (rspStr) {
                case SCISSORS:
                    sb.append(ROCK);
                    break;
                case ROCK:
                    sb.append(PAPER);
                    break;
                case PAPER:
                    sb.append(SCISSORS);
                    break;
            }
        }
        
        return sb.toString();
    }
}