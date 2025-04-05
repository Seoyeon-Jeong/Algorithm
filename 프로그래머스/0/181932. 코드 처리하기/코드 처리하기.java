class Solution {
    public String solution(String code) {
        String result = "";
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                if (mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            } else if (mode == 0) {
                if (i % 2 == 0) {
                    result += code.charAt(i);
                }
            } else if (mode == 1) {
                if (i % 2 == 1) {
                    result += code.charAt(i);
                }
            }
        }
        
        if (result.isEmpty()) {
            result = "EMPTY";
        }
        return result;
    }
}