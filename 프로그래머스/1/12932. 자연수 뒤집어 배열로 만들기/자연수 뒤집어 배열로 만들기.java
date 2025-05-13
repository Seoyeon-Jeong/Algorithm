class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] arr = str.split("");
        
        int[] result = new int[arr.length];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(arr[arr.length - 1 - i]);
        }
        
        return result;
    }
}