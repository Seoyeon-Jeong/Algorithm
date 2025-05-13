class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i = 0; i < answer.length; i++) {
            char[] arrChar = strlist[i].toCharArray();
            
            answer[i] = arrChar.length;
        }
        
        return answer;
    }
}