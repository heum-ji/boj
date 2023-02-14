import java.math.BigDecimal;
import java.math.RoundingMode;

class Solution {
    // 팩토리얼(재귀)
    private static BigDecimal factorial(BigDecimal num) {
        // num == 1 \\ num == 0
        if (num.compareTo(BigDecimal.valueOf(1)) == 0 || num.compareTo(BigDecimal.valueOf(0)) == 0) { 
            return BigDecimal.valueOf(1);
        }
        // num * factorial(num - 1)
        return num.multiply(factorial(num.subtract(BigDecimal.valueOf(1))));
    }
    
    public BigDecimal solution(int balls, int share) {
        BigDecimal bd = new BigDecimal(String.valueOf(balls));
        
        BigDecimal n = factorial(new BigDecimal(String.valueOf(balls)));
        BigDecimal m = factorial(new BigDecimal(String.valueOf(share)));
        BigDecimal temp = factorial(new BigDecimal(String.valueOf(balls - share)));
        
        return n.divide(temp.multiply(m), RoundingMode.HALF_EVEN);
    }
    
    
}