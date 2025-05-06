class Solution {
    public double solution(int[] numbers) {
        double result = 0;
        for (int number : numbers) {
            result += (double) number;
        }
        
        return result / numbers.length;
    }
}