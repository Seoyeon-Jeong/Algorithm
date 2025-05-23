class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        char[] charArr = my_string.toCharArray();
        
        int result = 0;
        
        for(int i = 0; i < charArr.length; i++) {
            result += charArr[i] - '0';
        }
        
        return result;
    }
}