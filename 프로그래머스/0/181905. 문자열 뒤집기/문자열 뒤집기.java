class Solution {
    public String solution(String my_string, int s, int e) {
        String str = my_string.substring(0, s);
        
        
        for (int i = e; i >= s; i--) {
            str += my_string.charAt(i);
        }
        
        str += my_string.substring(e + 1, my_string.length());
        
        return str;
    }
}