class Solution {
    public int solution(int a, int b) {
        int answer1 = Integer.parseInt(String.valueOf(a) + b);
        int answer2 = Integer.parseInt(String.valueOf(b) + a);
        
        return answer1 > answer2 ? answer1 : answer2;
    }
}