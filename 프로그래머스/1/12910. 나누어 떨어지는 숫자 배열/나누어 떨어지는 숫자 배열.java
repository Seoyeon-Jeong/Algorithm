import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        
        int[] intArr = new int[list.size()];
        
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = list.get(i);
        }
        
        Arrays.sort(intArr);
        
        return intArr;
    }
}