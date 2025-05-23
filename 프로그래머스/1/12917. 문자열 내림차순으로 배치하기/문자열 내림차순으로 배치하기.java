import java.util.*;

class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        String str = "";
        
        Arrays.sort(c);
        for (int i = c.length - 1; i >= 0; i--) {
            str += c[i];
        }
        
        return str;
    }
}