class Solution {
    public int[] solution(int[] num_list) {
        int odd = 0, even = 0;
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] result = {even, odd};
        return result;
    }
}