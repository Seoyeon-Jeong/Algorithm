class Solution {
    public int[] solution(int[] array) {
        int bigNum = array[0];
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (bigNum < array[i]) {
                bigNum = array[i];
                index = i;
            }
        }
        
        return new int[]{bigNum, index};
    }
}