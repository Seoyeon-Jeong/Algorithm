import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr=s.split("");
        
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int cnt=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    cnt++;
                }
            }
            if(cnt==1){
                answer+=arr[i];
            }            
        }
        return answer;
    }
}