
public class Binary {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 17, 19, 23, 30, 50 };

		// The recursive method takes the initial min
		// and max indices as parameters
		int index1 = binaryRec(arr, 6, 0, arr.length - 1);
		System.out.println(index1);

		int index2 = binaryRec(arr, 30, 0, arr.length - 1);
		System.out.println(index2);

		int index3 = binaryRec(arr, 40, 0, arr.length - 1);
		System.out.println(index3);
	}

	// begin and end represent the left and right indexes
	public static int binaryRec(int[] array, int target, int begin, int end) {
	    
	        if(begin <= end){
	            // Compute the middle index
	            int mid = /* ? */
	            		
	            // Base Case - we match our target, return mid
	        	if ( /* ? */) { 
	            		return mid;  
	        	}
	        
	            if (target < array[mid]) { // Too high
	                // Recursive call replacing the end point with the 
	                // index below the mid-point.
	                return /* ? */
	            }
	                
	            if (target > array[mid]) { // Too Low
	                // Recursive call replacing the begin point with the 
	                // index above the mid-point.
	                return /* ? */
	            }
	        }
	        
	        //Base case - not found
	        //If none of the other returns are hit, we know it wasn't found
	        return -1;
			
	    }

}
