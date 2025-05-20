class Solution {
    public int solution(int order) {
        int result = 0;
        String str = Integer.toString(order);
        
        for (char c : str.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
                result++;
            }
        }
        return result;
    }
}