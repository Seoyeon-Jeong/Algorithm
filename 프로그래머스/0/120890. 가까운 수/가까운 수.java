class Solution {
    public int solution(int[] array, int n) {
        int closestDiff = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;

        for (int i : array) {
            int diff = Math.abs(n - i);

            if (diff < closestDiff) {
                closestDiff = diff;
                result = i;
            } else if (diff == closestDiff) {
                result = Math.min(result, i);  // 거리 같으면 더 작은 수 선택
            }
        }

        return result;
    }
}
