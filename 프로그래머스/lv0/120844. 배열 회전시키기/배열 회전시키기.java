class Solution {
    public int[] solution(int[] numbers, String direction) {
        int count = numbers.length - 1;
        
        // 왼쪽 1칸 시프트
        if ("left".equals(direction)) {
            int temp = numbers[0];

            // 시프트
            for (int i = 0; i < count; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[count] = temp;
        } else { // right : 오른쪽 1칸 시프트
            int temp = numbers[count];

            // 시프트
            for (int i = count; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = temp;
        }
        
        return numbers;
    }
}