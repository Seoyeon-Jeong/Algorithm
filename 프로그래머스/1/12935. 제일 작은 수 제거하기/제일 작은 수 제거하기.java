import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr)
                                   .boxed()
                                   .collect(Collectors.toList());

        // 가장 작은 값 찾기
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        // 가장 작은 값 제거
        list.remove(Integer.valueOf(min)); // 값으로 삭제

        // 리스트가 비어 있으면 -1 추가
        if (list.isEmpty()) {
            list.add(-1);
        }

        // 다시 int[]로 변환
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
