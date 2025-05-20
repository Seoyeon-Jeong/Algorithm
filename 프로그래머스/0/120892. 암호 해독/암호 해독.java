class Solution {
    public String solution(String cipher, int code) {
        String str = "";
        char[] strArr = cipher.toCharArray();
        
        for(int i = code; i <= strArr.length; i += code) {
            str += strArr[i - 1];
        }
        
        return str;
    }
}