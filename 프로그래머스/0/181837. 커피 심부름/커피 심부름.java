class Solution {
    public int solution(String[] order) {
        int price = 0;
        for (String str : order) {
            if (str.contains("latte")) {
                price += 5000;
            } else {
                price += 4500;
            }
        }
        return price;
    }
}