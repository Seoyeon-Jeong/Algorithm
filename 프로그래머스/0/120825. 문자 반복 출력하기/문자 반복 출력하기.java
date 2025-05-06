class Solution {
    public String solution(String my_string, int n) {
        String str = "";
        
        for (char c : my_string.toCharArray()) {
            str += String.valueOf(c).repeat(n);
        }
        
        return str;
    }
}