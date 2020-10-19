
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

	public boolean sameEnds(int[] nums, int len) {

//		Return true if the group of N numbers at the start and end of the array are the same. For example, 
//		with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. 
//		You may assume that n is in the range 0..nums.length inclusive.
//
//		sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
//		sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
//		sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
		
		boolean sameends = true;
		
		for ( int i = 0; i < len; i++ ) {
			sameends = nums[i] == nums[(nums.length - len) + i];
			if ( !sameends ) return false;
		}
		
		return sameends;
	}

	public boolean tripleUp(int[] nums) {
		
//		Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... 
//		or 23, 24, 25.
//
//		tripleUp([1, 4, 5, 6, 2]) → true
//		tripleUp([1, 2, 3]) → true
//		tripleUp([1, 2, 4]) → false
		
		if ( nums.length < 3 ) return false;
		
		for ( int i = 0; i < nums.length - 2; i++ ) {
			int spot1 = nums[i];
			int spot2 = nums[i+1];
			int spot3 = nums[i+2];
			if ( spot2 == spot1 + 1 && spot3 == spot2 + 1 ) return true;
		}
		
		return false;
	}

	public int[] fizzArray3(int start, int end) {
		
//		Given start and end numbers, return a new array containing the sequence of integers from start up to but not 
//		including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the 
//		start number. Note that a length-0 array is valid. (See also: FizzBuzz Code)
//
//		fizzArray3(5, 10) → [5, 6, 7, 8, 9]
//		fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
//		fizzArray3(1, 3) → [1, 2]
		
		int[] fizzar = new int[end - start];
		
		for ( int i = 0; i < fizzar.length; i++ ) {
			fizzar[i] = start + i;
		}
		
		return fizzar;
	}

	public int[] shiftLeft(int[] nums) {
		
//		Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return 
//		the given array, or return a new array.
//
//		shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
//		shiftLeft([1, 2]) → [2, 1]
//		shiftLeft([1]) → [1]
		
		if ( nums.length < 2 ) return nums;
		
		int holder = nums[0];
		for ( int i = 0; i < nums.length - 1; i++ ) {
			if ( i == nums.length - 1 ) nums[i] = holder;
			else {
				nums[i] = nums[i+1];
			}			
		}
		nums[nums.length-1] = holder;
		
		return nums;
	}

	public int[] tenRun(int[] nums) {
		
//		For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until 
//		encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
//
//		tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
//		tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
//		tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
		
		boolean is10 = false;
		int newNumber = 0;
		
		for ( int i = 0; i< nums.length; i++ ) {
			if ( nums[i] % 10 == 0 ) {
				is10 = true;
				newNumber = nums[i] % 100;
			}
			else if ( is10 ) nums[i] = newNumber;
		}
		
		return nums;
	}

	public int[] pre4(int[] nums) {

//		Given a non-empty array of ints, return a new array containing the elements from the original array that come before 
//		the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to 
//		create an array of length 0.
//
//		pre4([1, 2, 4, 1]) → [1, 2]
//		pre4([3, 1, 4]) → [3, 1]
//		pre4([1, 4, 4]) → [1]
		
		int indexOf4 = 0;
		
		for ( int i = 0; i < nums.length; i++ ) {
			if ( nums[i] == 4 ) {
				indexOf4 = i;
				break;
			}
		}
		
		if ( indexOf4 < 0 ) return nums;
		int[] prefour = new int[indexOf4];
		for ( int i = 0; i < indexOf4; i++ ) {
			prefour[i] = nums[i];
		}
		return prefour;
	}

}
