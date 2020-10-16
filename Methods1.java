
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

}
