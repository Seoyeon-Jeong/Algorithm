class Solution {
    public String solution(String my_string, int m, int c) {
        String result = "";
        char[] arr = my_string.toCharArray();
        
        for (int i = c - 1; i < my_string.length(); i += m) {
            result += arr[i];
        }
        
        return result;
    }
}