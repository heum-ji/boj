class Solution {
    private static final int TOP_GAEMI_ATK = 5; // 장군개미
    private static final int MID_GAEMI_ATK = 3; // 병정개미
    private static final int BOT_GAEMI_ATK = 1; // 일개미
    
    public int solution(int hp) {
        int answer = 0;
                        
        while (hp > 0) {
            
            if (hp >= TOP_GAEMI_ATK) {
                answer += hp / TOP_GAEMI_ATK;
                hp %= TOP_GAEMI_ATK;
            }

            if (hp >= MID_GAEMI_ATK) {
                answer += hp / MID_GAEMI_ATK;
                hp %= MID_GAEMI_ATK;
            }

            if (hp >= BOT_GAEMI_ATK) {
                answer += hp / BOT_GAEMI_ATK;
                hp %= BOT_GAEMI_ATK;
            }
        }
        
        return answer;
    }
}