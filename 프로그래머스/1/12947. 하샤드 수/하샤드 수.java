class Solution {
    public boolean solution(int x) {
        int origin = x;
        int result = 0;
        
        while(x > 0) {
            result += x % 10;
            x /= 10;
        }
        
        return origin % result == 0 ? true : false;
    }
}