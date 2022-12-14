class Solution {
    public void setZeroes(int[][] matrix) {
        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    count++;
                    for(int row=0; row<matrix[i].length;row++){
                        if(matrix[i][row] != 0 && matrix[i][row]!=-1){
                              matrix[i][row] = -1;
                        }
                    }
                    for(int col=0; col<matrix.length; col++){
                        if(matrix[col][j]!=0 && matrix[col][j]!=-1){
                              matrix[col][j] = -1;
                        }
                    }
                }
            }
        }
        if(count!=0){
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[i].length; j++){
                    if(matrix[i][j]==-1){
                        matrix[i][j] = 0;
                    }
                }
            }
        }  
    }
}
        
    
