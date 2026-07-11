class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowHasZero = false;
        boolean firstColumnHasZero = false;
        // checking whether first row has zero or not
        for(int i=0; i<cols; i++){
            if(matrix[0][i] == 0){
                firstRowHasZero = true;
                break;
            }
        }
        // checking whether first column has zero or not
        for(int i=0; i<rows; i++){
            if(matrix[i][0] == 0){
                firstColumnHasZero = true;
                break;
            }
        }
        //Using first row and column as marker
        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //Setting marked rows as zero
        for(int i=1; i< rows; i++){
            if(matrix[i][0] == 0){
                for(int j=1; j<cols; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        //Setting marked columns as zero
        for(int i=1; i< cols; i++){
            if(matrix[0][i] == 0){
                for(int j=1; j<rows; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        //Setting first row zero if needed
        if(firstRowHasZero){
            for(int i=0; i<cols; i++){
                matrix[0][i] = 0;
            }
        }
        //Setting first row zero if needed
        if(firstColumnHasZero){
            for(int j = 0; j<rows; j++){
                matrix[j][0] = 0;
            }
        }     
    }
}