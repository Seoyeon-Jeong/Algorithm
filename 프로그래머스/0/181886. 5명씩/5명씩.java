class Solution {
    public String[] solution(String[] names) {
        int count = names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1;
        
        String[] str = new String[count];
        
        for (int i = 0; i < str.length; i++) {
            str[i] = names[i * 5];
        }
        
        return str;
    }
}