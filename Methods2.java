
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

	public boolean modThree(int[] nums) {

//		Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
//
//		modThree([2, 1, 3, 5]) → true
//		modThree([2, 1, 2, 5]) → false
//		modThree([2, 4, 2, 5]) → true
		
		if ( nums.length < 3 ) return false;
		
		for ( int i = 0; i < nums.length - 2; i++ ) {
			int spot1 = nums[i] % 2;
			int spot2 = nums[i+1] % 2;
			int spot3 = nums[i+2] % 2;
			if ( spot1 == spot2 && spot2 == spot3 ) return true;
		}

		return false;
	}

	public boolean haveThree(int[] nums) {

//		Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to 
//		each other.
//
//		haveThree([3, 1, 3, 1, 3]) → true
//		haveThree([3, 1, 3, 3]) → false
//		haveThree([3, 4, 3, 3, 4]) → false
		
		if ( nums.length < 5 ) return false;
		
		int indexOf3 = Integer.MIN_VALUE;
		int count3 = 0;
		boolean goodSpace = false;
		
		for ( int i = 0; i< nums.length; i++ ) {
			if ( nums[i] == 3 && indexOf3 == Integer.MIN_VALUE ) {
				indexOf3 = i;
				count3++;
			}
			else if ( nums[i] == 3 ) {
				goodSpace = i == indexOf3 + 2;
				count3++;
				indexOf3 = i;
			}
			if ( count3 == 2 && !goodSpace ) return false;
		}
		return goodSpace && count3 == 3;
	}

	public boolean twoTwo(int[] nums) {

//		Given an array of ints, return true if every 2 that appears in the array is next to another 2.
//
//
//		twoTwo([4, 2, 2, 3]) → true
//		twoTwo([2, 2, 4]) → true
//		twoTwo([2, 2, 4, 2]) → false
		
		boolean two2 = true;
		int indexOf2 = Integer.MIN_VALUE;
		int count2 = 0;
		
		for ( int i = 0; i < nums.length; i++ ) {
			if ( nums[i] == 2 && indexOf2 == Integer.MIN_VALUE ) {
				indexOf2 = i;
				count2++;
				two2 = false;
			}
			else if ( nums[i] == 2 ) {
				two2 = i == indexOf2 + 1;
				count2++;
				indexOf2 = i;
			}
			if ( count2 > 1 && !two2 ) return false;
		}
		
		return two2;
		
	}

}
