class Solution {
    public int solution(String myString, String pat) {
        String str = myString.replace("A", "#");
        str = str.replace("B", "A");
        str = str.replace("#", "B");
        
        return str.contains(pat) ? 1 : 0;
    }
}