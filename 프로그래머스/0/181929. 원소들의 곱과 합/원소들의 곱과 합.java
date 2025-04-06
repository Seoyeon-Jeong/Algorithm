class Solution {
    public int solution(int[] num_list) {
        int x = 0;
        int y = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            x += num_list[i];
            y *= num_list[i];
        }
        
        return (x * x) > y ? 1 : 0;
    }
}