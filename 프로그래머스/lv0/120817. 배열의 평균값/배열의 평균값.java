class Solution {
    public double solution(int[] numbers) {
        int size = numbers.length;
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        
        return (double) sum / size;
    }
}