package in.ineuron.in;

public class StairCase {

	    public static int countCompleteRows(int n) {
	        int count = 0;
	        int row = 1;

	        while (n >= row) {
	            n -= row;
	            row++;
	            count++;
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        int n = 5;
	        int completeRows = countCompleteRows(n);
	        System.out.println("Number of complete rows: " + completeRows);
	    }
	}



