
public class Methods1 {

	public int countEvens(int[] nums) {

//		Return the number of even ints in the given array. Note: the % "mod" operator computes 
//		the remainder, e.g. 5 % 2 is 1.
//
//		countEvens([2, 1, 2, 3, 4]) → 3
//		countEvens([2, 2, 0]) → 3
//		countEvens([1, 3, 5]) → 0
		
		int countevens = 0;
		
		for ( int i = 0; i < nums.length; i++ ) {
			if ( nums[i] % 2 == 0 ) countevens++;
		}
		
		return countevens;
	}

	public int bigDiff(int[] nums) {

//		Given an array length 1 or more of ints, return the difference between the largest and 
//		smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) 
//		methods return the smaller or larger of two values.
//
//		bigDiff([10, 3, 5, 6]) → 7
//		bigDiff([7, 2, 10, 9]) → 8
//		bigDiff([2, 10, 7, 2]) → 8
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for ( int i = 0; i < nums.length; i++ ) {
			if ( nums[i] > max ) max = nums[i];
			if ( nums[i] < min ) min = nums[i];
		}
		
		return Math.max(max, min) - Math.min(max, min);
	}

	public int centeredAverage(int[] nums) {

//		Return the "centered" average of an array of ints, which we'll say is the mean average of 
//		the values, except ignoring the largest and smallest values in the array. If there are multiple 
//		copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int 
//		division to produce the final average. You may assume that the array is length 3 or more.
//
//		centeredAverage([1, 2, 3, 4, 100]) → 3
//		centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
//		centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		for ( int i = 0; i < nums.length; i++ ) {
			if ( nums[i] > max ) max = nums[i];
			if ( nums[i] < min ) min = nums[i];
			sum += nums[i];
		}
		
		return (sum - max - min)/(nums.length - 2);
	}

	public int sum13(int[] nums) {

//		Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very 
//		unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
//
//		sum13([1, 2, 2, 1]) → 6
//		sum13([1, 1]) → 2
//		sum13([1, 2, 2, 1, 13]) → 6
		
		int sum = 0;
		int indexOf13 = Integer.MIN_VALUE;
		
		for ( int i = 0; i < nums.length; i++ ) {
			if ( nums[i] == 13 ) indexOf13 = i + 1;
			else if ( i == indexOf13 ) continue;
			else sum += nums[i];
		}
		
		return sum;
	}

	public int sum67(int[] nums) {

//		Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending 
//		to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
//
//		sum67([1, 2, 2]) → 5
//		sum67([1, 2, 2, 6, 99, 99, 7]) → 5
//		sum67([1, 1, 6, 7, 2]) → 4
		
		boolean is6 = false;
		int sum = 0;
		
		for ( int i = 0; i < nums.length; i++ ) {
			if ( nums[i] == 6 ) is6 = true;
			else if ( nums[i] == 7  && is6 ) is6 = false;
			else if ( !is6 ) sum += nums[i];
		}
		return sum;
	}

	public boolean has22(int[] nums) {

//		Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
//
//		has22([1, 2, 2]) → true
//		has22([1, 2, 1, 2]) → false
//		has22([2, 1, 2]) → false
		
		boolean is2 = false;
		
		for ( int i = 0; i < nums.length; i++ ) {
			int numsi = nums[i];
			if ( is2 && nums[i] == 2 ) return true;
			else if ( is2 && nums[i] != 2 ) is2 = nums[i] == 2;
			if ( !is2 ) is2 = nums[i] == 2;
		}
		
		return false;
	}

	public boolean lucky13(int[] nums) {

//		Given an array of ints, return true if the array contains no 1's and no 3's.
//
//		lucky13([0, 2, 4]) → true
//		lucky13([1, 2, 3]) → false
//		lucky13([1, 2, 4]) → false

		for ( int i = 0; i < nums.length; i++ ){
			if ( nums[i] == 1 || nums[i] == 3 ) return false;
		}
		return true;
	}

	public boolean sum28(int[] nums) {

//		Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
//
//		sum28([2, 3, 2, 2, 4, 2]) → true
//		sum28([2, 3, 2, 2, 4, 2, 2]) → false
//		sum28([1, 2, 3, 4]) → false

		int sum2 = 0;
		for ( int i = 0; i < nums.length; i++ ) {
			if ( nums[i] == 2 ) sum2 += nums[i];
		}

		return sum2 == 8;

	}

	public boolean more14(int[] nums) {

//		Given an array of ints, return true if the number of 1's is greater than the number of 4's
//
//		more14([1, 4, 1]) → true
//		more14([1, 4, 1, 4]) → false
//		more14([1, 1]) → true

		int sum1 = 0;
		int sum4 = 0;

		for ( int i = 0; i < nums.length; i++ ){
			if ( nums[i] == 1 ) sum1++;
			if ( nums[i] == 4 ) sum4++;
		}

		return sum1 > sum4;

	}

	public int[] fizzArray(int n) {

//		Given a number n, create and return a new int array of length n, containing the numbers 0, 1,
//		2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do not need
//		a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times
//		in that case, so it just works. The syntax to make a new int array is: new int[desired_length]
//		(See also: FizzBuzz Code)
//
//		fizzArray(4) → [0, 1, 2, 3]
//		fizzArray(1) → [0]
//		fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

		int[] fizzarr = new int[n];
		for ( int i = 0; i < n; i++ ) {
			fizzarr[i] = i;
		}

		return fizzarr;
	}

	public boolean only14(int[] nums) {

//		Given an array of ints, return true if every element is a 1 or a 4.
//
//		only14([1, 4, 1, 4]) → true
//		only14([1, 4, 2, 4]) → false
//		only14([1, 1]) → true

		int count14 = 0;
		for ( int i = 0; i < nums.length; i++ ){
			if ( nums[i] == 1 || nums[i] == 4 ) count14++;
		}

		return count14 == nums.length;
	}

	public String[] fizzArray2(int n) {

//		Given a number n, create and return a new string array of length n, containing the strings "0",
//		"1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. Note:
//		String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array
//		is: new String[desired_length]  (See also: FizzBuzz Code)
//
//		fizzArray2(4) → ["0", "1", "2", "3"]
//		fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
//		fizzArray2(2) → ["0", "1"]

		String[] fizzarr = new String[n];
		for ( int i = 0; i < n; i++ ) {
			fizzarr[i] = Integer.toString(i);
		}

		return fizzarr;
	}
}
