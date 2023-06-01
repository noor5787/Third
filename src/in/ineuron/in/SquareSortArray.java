package in.ineuron.in;
import java.util.Arrays;

public class SquareSortArray {

	
	    public static int[] sortedSquares(int[] nums) {
	        int[] result = new int[nums.length];
	        int left = 0;
	        int right = nums.length - 1;
	        int i = nums.length - 1;

	        while (left <= right) {
	            int leftSquare = nums[left] * nums[left];
	            int rightSquare = nums[right] * nums[right];

	            if (leftSquare > rightSquare) {
	                result[i] = leftSquare;
	                left++;
	            } else {
	                result[i] = rightSquare;
	                right--;
	            }
	            i--;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums = {-4, -1, 0, 3, 10};
	        int[] sortedSquares = sortedSquares(nums);
	        System.out.println(Arrays.toString(sortedSquares));
	    }
	}



