class Solution {
    public int solution(int[] numbers, int n) {
        int result = 0;
    
        for (int i : numbers) {
            if (result <= n) {
                result += i;
            }
        }
        return result;
    }
}