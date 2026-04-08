class Solution {
    public void rotate(int[][] matrix) {
        //to rotate it 90 degree we first must create the transpose of the matrix and after that reverse the rows
        transpose(matrix);
        reverseR(matrix);
    }
    public void transpose(int [] [] matrix){
        for( int i=0;i<matrix.length;i++){
            for(int j=i; j<matrix[0].length ;j++){
                //swaping the values
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public void reverseR(int [] [] matrix){
        for(int i=0;i<matrix.length ;i++){
            int left=0;
            int right=matrix[i].length-1;
            while(left<right){
                int temp= matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }

}
