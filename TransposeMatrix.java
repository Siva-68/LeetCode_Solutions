// Given a 2D integer array matrix, return the transpose of matrix.

// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

  class TransposeMatrix{
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] Tmatrix = new int[col][row];

        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                Tmatrix[j][i]= matrix[i][j];
            }
        }
        return Tmatrix;
    }
}
