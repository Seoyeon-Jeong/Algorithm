class Solution {
    public String solution(String my_string, String alp) {
        if (!my_string.contains(alp)) {
            return my_string;
        }
        return my_string.replace(alp, alp.toUpperCase());
    }
}