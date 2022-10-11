class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a=numBottles;
        while(numBottles>=numExchange){
            a+=numBottles/numExchange;
            numBottles = numBottles/numExchange+  numBottles%numExchange;
        }
        return a;
    }
}