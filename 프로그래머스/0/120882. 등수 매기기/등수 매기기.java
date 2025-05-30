class Solution {
    public int[] solution(int[][] score) {
        double[] result = new double[score.length];
        int[] ranks = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
            result[i] = (double) (score[i][0] + score[i][1]) / 2;
        }
        for(int i = 0; i < score.length; i++) {
            int count = 1;
            for (int j = 0; j < score.length; j++) {
                if(result[i] < result[j]) {
                    count++;
                }
            }
            ranks[i] = count;
        }
        return ranks;
    }
}