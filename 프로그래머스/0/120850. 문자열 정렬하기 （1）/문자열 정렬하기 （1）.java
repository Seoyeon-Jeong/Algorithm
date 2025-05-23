import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[a-z]", "");
        String[] charArr = str.split("");
        
        int[] arr = new int[charArr.length];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(charArr[i]);
        }
        
        Arrays.sort(arr);
        
        return arr;
    }
}