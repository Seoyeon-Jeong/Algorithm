class Solution {
    public String solution(String my_string) {
        String result = "";
        
        for (String str : my_string.split("")) {
            if (result.indexOf(str) == -1) {
                result += str;
            }
        }
        return result;
    }
}