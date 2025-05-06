class Solution {
    public int solution(int price) {
        return price >= 500000 ? price * (100 - 20) / 100 : price >= 300000 ? price * (100 - 10) / 100 : price >= 100000 ? price * (100 - 5) / 100 : price;
    }
}