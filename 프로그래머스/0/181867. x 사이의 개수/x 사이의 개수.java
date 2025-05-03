import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        String[] words = myString.split("x");
        
        for (String word : words) {
            list.add(word.length());
        }
        
        if (myString.endsWith("x")) {
            list.add(0);
        }
        
        int[] intArr = new int[list.size()];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = list.get(i);
        }
        return intArr;
    }
}