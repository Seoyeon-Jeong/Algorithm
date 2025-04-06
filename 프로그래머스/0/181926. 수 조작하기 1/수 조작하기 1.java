class Solution {
    public int solution(int n, String control) {
        
        for (char s : control.toCharArray()) {
            if (s == 'w') {
                n += 1;
            } else if (s == 's') {
                n -= 1;
            } else if (s == 'd') {
                n += 10;
            } else if (s == 'a') {
                n -= 10;
            }
        }
        
        return n;
    }
}