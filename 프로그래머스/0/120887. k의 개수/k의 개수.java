class Solution {
    public int solution(int i, int j, int k) {
        int result = 0;
        String str = Integer.toString(k);
        
        for (int x = i; x <= j; x++) {
            String s = Integer.toString(x);
            
            if(s.contains(str)) {
                String[] arr = s.split("");
                
            for (String c : arr) {
                if (c.equals(str)) {
                    result++;
                }
            }
        }
        }
        return result;
    }
}