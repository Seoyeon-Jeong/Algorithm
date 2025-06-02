class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (String s: my_string.split("\\D")) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}