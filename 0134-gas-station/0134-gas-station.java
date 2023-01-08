class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int a = 0, b = 0;
        for(int i = 0 ; i<gas.length; i++){
            b += cost[i];
            a += gas[i];
        }
        if(a < b) return -1;
        int c = 0, start = 0;
        for(int i = 0 ; i < gas.length; i++){
            c = c +(gas[i] - cost[i]);
            if(c < 0 ){
                start = i+1;
                c = 0;
            }
        }
        return start; 
    }
}