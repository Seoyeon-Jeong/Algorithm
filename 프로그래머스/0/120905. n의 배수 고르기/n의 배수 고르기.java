import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> numArr = new ArrayList<>();
        
        for (int num : numlist) {
            if (num % n == 0) {
                numArr.add(num);
            }
        }
        int[] answer = new int[numArr.size()];
        for (int i = 0; i < numArr.size(); i++) {
            answer[i] = numArr.get(i);
        }
        return answer;
    }
}