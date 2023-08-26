public class MagicSquare {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        boolean isMagicSquare = isMagicSquare(matrix);

        if (isMagicSquare) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix is not a magic square.");
        }
    }

    static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int magicSum = n * (n * n + 1) / 2;

        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        int diagonalSum = 0;
        int antiDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += matrix[i][j];
                colSum[j] += matrix[i][j];
                if (i == j) {
                    diagonalSum += matrix[i][j];
                }
                if (i + j == n - 1) {
                    antiDiagonalSum += matrix[i][j];
                }
            }
        }

        if (diagonalSum != magicSum || antiDiagonalSum != magicSum) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            if (rowSum[i] != magicSum || colSum[i] != magicSum) {
                return false;
            }
        }

        return true;
    }
}

