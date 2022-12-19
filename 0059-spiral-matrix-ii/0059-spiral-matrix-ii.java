class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int k = 0;
        int rowStart = 0, rowEnd = n;
        int colStart = 0, colEnd = n;
        while (k < n * n) {
            for(int i = rowStart; k < n * n && i < colEnd; i ++) {
                result[rowStart][i] = ++ k;
            }
            rowStart ++;
            for(int i = rowStart; k < n * n && i < rowEnd; i ++) {
                result[i][colEnd - 1] = ++ k;
            }
            colEnd --;
            for(int i = colEnd - 1; k < n * n && i >= colStart; i --) {
                result[rowEnd - 1][i] = ++ k;
            }
            rowEnd --;
            for(int i = rowEnd - 1; k < n * n && i >= rowStart; i --) {
                result[i][colStart] = ++ k;
            }
            colStart ++;
        }
        return result;
    }
}