class Solution {
    public int[] solution(int[] arr, int k) {
        int[] newArr = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 0) {
                newArr[i] = arr[i] + k;
            } else {
                newArr[i] = arr[i] * k;
            }
        }
        return newArr;
    }
}