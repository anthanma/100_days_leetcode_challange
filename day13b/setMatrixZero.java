class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        boolean firstRowZero = false;
        boolean firstColZero = false;
        
        //check first row
        for(int i=0;i<cols;i++){
            if(matrix[0][i]==0){
                firstRowZero=true;
                break;
            }
        }
        //check first column
        for(int i=0;i<rows; i++){
            if(matrix[i][0]==0){
                firstColZero=true;
                break;
            }
        }
        
        for(int i=1; i<rows ; i++){
            for(int j=1 ; j<cols ; j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        
        for(int i=1; i<matrix.length ; i++){
            for(int j=1 ; j<matrix[0].length ; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                   matrix[i][j]=0;
                }
            }
        }

        
        // STEP 4: The Clean Up
        // If firstRowZero is true, nuke the entire 0th row.
        // If firstColZero is true, nuke the entire 0th column.
        
        // Write the final two loops...
        if(firstRowZero==true){
            for(int i=0;i<cols;i++){
                matrix[0][i]=0;
            }
        }
        if(firstColZero==true){
            for(int i=0;i<rows;i++){
                matrix[i][0]=0;
            }
        }
    }
}
/*
//BRUTE FORCE APPROACH
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<int []> ind= new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    ind.add(new int [] {i,j});
                }
            }
        } 
        for(int i=0;i<ind.size(); i++){
            remove(ind.get(i),matrix);
        }
    }
    public void remove(int [] arr , int [] [] matrix){
        int row = arr[0] ;
        int column=arr[1];
        //removing column
        for(int i=0 ; i<matrix.length ;i++){
            matrix[i][column]=0;
        }
        //removing row
        for(int i=0 ; i<matrix[0].length ; i++){
            matrix[row][i]=0;
        }
    }
}
*/
