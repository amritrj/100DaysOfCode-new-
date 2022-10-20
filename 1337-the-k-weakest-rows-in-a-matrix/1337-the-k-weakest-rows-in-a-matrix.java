class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int l = mat.length;
        int[] rs = new int[k];
        int[] shoot = new int[l];
        
        for(int i = 0; i < l; i++){
            int count = 0;
            for(int j = 0; j < mat[i].length; j++){
                count += mat[i][j];
            }
            shoot[i] = count;
        }
        
        for(int i = 0; i < k; i++){
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j = 0; j < l; j++){
                if(shoot[j] != -1 && shoot[j] < min){
                    min = shoot[j];
                    index = j;
                }
            }
            rs[i] = index;
            shoot[index] = -1;
        }
        
        return rs;
        
    }
}