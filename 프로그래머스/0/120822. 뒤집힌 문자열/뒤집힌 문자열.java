class Solution {
    public String solution(String my_string) {
        String str = "";
        
        char[] strArr = my_string.toCharArray();
        
        for (int i = strArr.length - 1; i >= 0; i--) {
            str += strArr[i];
        }
        
        return str;
    }
}