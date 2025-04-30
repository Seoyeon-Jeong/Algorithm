import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> deleteSet = new HashSet<>();

        for (int num : delete_list) {
            deleteSet.add(num);
        }

        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                list.add(num);
            }
        }

        int[] newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }

        return newArr;
    }
}
