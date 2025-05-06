class Solution {
    public int[] solution(int[] num_list) {
        int[] numArr = new int[num_list.length];
        
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = num_list[(num_list.length - 1) - i];
        }
        
        return numArr;
    }
}