import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < intervals.length; i++) {
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                list.add(arr[j]);
            }
        }
        
        int[] intArr = new int[list.size()];
        
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = list.get(i);
        }
        
        return intArr;
    }
}