class Solution {
    public String solution(int n) {
        String str = "";
        
        for(int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                str += "수";
            } else {
                str += "박";
            }
        }
        return str;
    }
}