class Solution {
    public long solution(String numbers) {
        String[] strNum = {"zero", "one", "two", "three", "four",
                           "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < strNum.length; i++) {
            numbers = numbers.replaceAll(strNum[i], String.valueOf(i));
        }
        return Long.valueOf(numbers);
    }
}