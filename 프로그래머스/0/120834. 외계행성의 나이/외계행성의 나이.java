class Solution {
    public String solution(int age) {
        String[] ageArr = String.valueOf(age).split("");
        String str = "abcdefghij";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ageArr.length; i++) {
            int num = Integer.parseInt(ageArr[i]); 
            result.append(str.charAt(num)); 
        }

        return result.toString();
    }
}