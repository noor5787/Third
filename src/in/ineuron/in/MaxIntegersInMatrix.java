package in.ineuron.in;

public class MaxIntegersInMatrix {

	    public static int maxCount(int m, int n, int[][] ops) {
	        if (ops == null || ops.length == 0) {
	            return m * n;
	        }
	        
	        int minRow = m;
	        int minCol = n;
	        
	        for (int[] op : ops) {
	            minRow = Math.min(minRow, op[0]);
	            minCol = Math.min(minCol, op[1]);
	        }
	        
	        return minRow * minCol;
	    }
	    
	    public static void main(String[] args) {
	        int m = 3;
	        int n = 3;
	        int[][] ops = {{2, 2}, {3, 3}};
	        
	        int result = maxCount(m, n, ops);
	        System.out.println("The number of maximum integers in the matrix: " + result);
	    }
	}



