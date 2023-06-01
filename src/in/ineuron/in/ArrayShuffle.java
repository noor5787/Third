package in.ineuron.in;

public class ArrayShuffle {

	    public static int[] shuffle(int[] nums, int n) {
	        int[] result = new int[2 * n];
	        int index = 0;
	        int i = 0;
	        int j = n;
	        
	        while (i < n && j < 2 * n) {
	            result[index++] = nums[i++];
	            result[index++] = nums[j++];
	        }
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {2, 5, 1, 3, 4, 7};
	        int n = 3;
	        
	        int[] shuffledArray = shuffle(nums, n);
	        
	        System.out.print("[");
	        for (int i = 0; i < shuffledArray.length; i++) {
	            System.out.print(shuffledArray[i]);
	            if (i < shuffledArray.length - 1) {
	                System.out.print(",");
	            }
	        }
	        System.out.println("]");
	    }
	}



