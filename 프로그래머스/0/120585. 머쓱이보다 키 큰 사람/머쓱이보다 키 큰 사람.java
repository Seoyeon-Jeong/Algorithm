class Solution {
    public int solution(int[] array, int height) {
        int count = 0;
        
        for(int x : array) {
            if (x > height) {
                count++;
            }
        }
        
        return count;
    }
}