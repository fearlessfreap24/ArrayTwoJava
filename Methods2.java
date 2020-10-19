
public class Methods2 {

	public boolean has12(int[] nums) {

//		Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
//
//		has12([1, 3, 2]) → true
//		has12([3, 1, 2]) → true
//		has12([3, 1, 4, 5, 2]) → true
		
		boolean isOne = false;
		
		for ( int i = 0; i < nums.length; i++ ) {
			if ( isOne && nums[i] == 2 ) return true;
			if ( nums[i] == 1 ) isOne = true;
		
		}
		return false;
	}

}
