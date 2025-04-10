import java.util.*;

class Solution {
    public List<Integer> solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
            
        for (int i = k; i <= n; i++) {
            if (i % k == 0) {
                list.add(i);
            }
        }
        
        return list;
    }
}