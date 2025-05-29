class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = { 
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        
        String[] strArr = letter.split(" ");
        
        for (String i : strArr) {
            for (int j = 0; j <morse.length; j++) {
                if(i.equals(morse[j])) {
                    answer += (char) (j + 'a');
                }
            }
        }
        return answer;
    }
}