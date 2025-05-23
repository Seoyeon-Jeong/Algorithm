class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length + 1];
        
        for(int i = 0; i < num_list.length; i++) {
            result[i] = num_list[i];
        }
        
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            result[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            result[num_list.length] = num_list[num_list.length - 1] * 2;
        }
        
        return result;
    }
}