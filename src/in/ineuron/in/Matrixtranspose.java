package in.ineuron.in;

public class Matrixtranspose {

	    public static int[][] transpose(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int[][] transposedMatrix = new int[cols][rows];
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transposedMatrix[j][i] = matrix[i][j];
	            }
	        }
	        
	        return transposedMatrix;
	    }
	    
	    public static void main(String[] args) {
	        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        
	        int[][] transposedMatrix = transpose(matrix);
	        
	        System.out.println("Original Matrix:");
	        printMatrix(matrix);
	        
	        System.out.println("\nTransposed Matrix:");
	        printMatrix(transposedMatrix);
	    }
	    
	    public static void printMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


