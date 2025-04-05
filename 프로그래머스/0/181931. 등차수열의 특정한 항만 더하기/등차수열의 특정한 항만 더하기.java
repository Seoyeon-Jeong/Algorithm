class Solution {
    public int solution(int a, int d, boolean[] included) {
        int result = 0;
        int[] answer = new int[included.length];
        answer[0] = a;
        
        for (int i = 1; i < answer.length; i++) {
            answer[i] = a + d;
            a = answer[i];
        }
        
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                result += answer[i];
            }
        }
        
        return result;
    }
}