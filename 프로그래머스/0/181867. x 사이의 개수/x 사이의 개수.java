import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                count++;
                if (i == myString.length() - 1) {
                    list.add(count);
                }
            }
            else {
                list.add(count);
                count = 0;
                if (i == myString.length() - 1) {
                    list.add(count);
                }
            }
        }
        
        int[] intArr = new int[list.size()];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = list.get(i);
        }
        return intArr;
    }
}