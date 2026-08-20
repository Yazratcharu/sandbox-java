public class MatrixDemo {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        int sumDiagonal = 0;
        int [][] transposed = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
                sum += matrix[i][j];
                if (i == j){
                    sumDiagonal += matrix[i][j];
                }
                transposed[j][i] = matrix[i][j];

            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(transposed[i][j]+ " ");

            }
            System.out.println();
        }
        System.out.println("Сумма всех чисел в массиве: "+sum);
        System.out.println("Сумма всех чисел в главной диагонали: "+sumDiagonal);
    }
}
