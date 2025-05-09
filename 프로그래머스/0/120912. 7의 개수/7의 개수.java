import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String str = Arrays.toString(array); 
        String[] arr = str.split("");
        
        for (String s : arr) {
            if (s.equals("7")) {
                answer ++;
            }
        } 
        return answer;
    }
}