
public class SymmetricMatrixCheck {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        
        boolean isSymmetric = isSymmetricMatrix(matrix);
        
        if (isSymmetric) {
            System.out.println("Matrix is symmetric.");
        } else {
            System.out.println("Matrix is not symmetric.");
        }
    }
    
    static boolean isSymmetricMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        if (rows != columns) {
            return false;
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
    


