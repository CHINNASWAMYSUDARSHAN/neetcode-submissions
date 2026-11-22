class NumMatrix {
    int sum[][];
    public NumMatrix(int[][] matrix) {
    sum=new int[matrix.length+1][matrix[0].length+1];
    for(int i=1;i<sum.length;i++){
        for(int j=1;j<sum[i].length;j++){
            sum[i][j]=matrix[i-1][j-1]+sum[i][j-1]+sum[i-1][j]-sum[i-1][j-1];
        }
    }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
       row1+=1;row2+=1;col1+=1;col2+=1;
       return sum[row2][col2]-sum[row2][col1-1]-sum[row1-1][col2]+sum[row1-1][col1-1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */