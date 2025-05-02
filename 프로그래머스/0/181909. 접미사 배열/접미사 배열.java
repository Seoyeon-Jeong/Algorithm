import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] result = new String[length];
        
        for(int i = 0; i < result.length; i++) {
            result[i] = my_string.substring(i);
        }
        
        Arrays.sort(result);
        return result;
    }
}