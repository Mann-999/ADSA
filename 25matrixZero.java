import java.util.*;

class Main {
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        for(int i = 0; i < rows; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }

        for(int j = 0; j < cols; j++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }

        for(int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < rows; i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j < cols; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 1; j < cols; j++){
            if(matrix[0][j] == 0){
                for(int i = 0; i < rows; i++){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRowZero){
            for(int j = 0; j < cols; j++){
                matrix[0][j] = 0;
            }
        }

        if(firstColZero){
            for(int i = 0; i < rows; i++){
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        setZeroes(matrix);

        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
