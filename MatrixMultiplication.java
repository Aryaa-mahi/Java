public class MatrixMultiplication {
    public static void main(String[] args) {
     
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };
        // RESULTANT MATRIX
        int[][] result = new int[2][2];
        //MULTIPLICATION
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0; // Initialize the result matrix element to 0
                for (int k = 0; k < 2; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j]; 
                }
            }
        }
        System.out.println("Product of the two matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}