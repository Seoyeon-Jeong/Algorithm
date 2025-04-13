class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        int result2 = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length >= 11) {
                result +=num_list[i];
            } else if (num_list.length <= 10) {
                result2 *= num_list[i];
            }
        }
        return num_list.length >= 11 ? result : result2;
    }
}