import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] games = {a, b, c, d};
        Arrays.sort(games);
        
        if (games[0] == games[3]) {
            return 1111 * games[0];
        } else if (games[0] == games[2] || games[1] == games[3]) {
            return (int) Math.pow(10 * games[1] + (games[0] + games[3] - games[1]), 2);
        } else if(games[0] == games[1] && games[2] == games[3]) {
            return (games[2] + games[0]) * (games[2] - games[0]);
        } else if(games[0] == games[1]) {
            return games[2] * games[3]; 
        } else if(games[1] == games[2]) {
            return games[0] * games[3]; 
        } else if(games[2] == games[3]) {
            return games[0] * games[1]; 
        } else {
            return games[0];
        }
    }
}