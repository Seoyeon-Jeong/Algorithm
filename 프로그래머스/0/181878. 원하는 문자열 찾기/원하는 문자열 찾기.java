class Solution {
    public int solution(String myString, String pat) {
        String str = myString.toLowerCase();
        
        if(str.contains(pat.toLowerCase())) {
            return 1;
        }
        return 0;
    }
}