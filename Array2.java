import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {

		Array2 start = new Array2();		
		start.run();
	}

	private void run() {
		Methods1 m1 = new Methods1();
		Methods2 m2 = new Methods2();

//		int[][] nums1 = { {2, 1, 2, 3, 4}, {2, 2, 0}, {1, 3, 5} };
//		for ( int[] nums : nums1 ) {
//			System.out.printf("nums = %s : %d\n", nums.toString(), m1.countEvens(nums));
//		}
		
//		int[][] nums2 = { {10, 3, 5, 6}, {7, 2, 10, 9}, {2, 10, 7, 2} };
//		for ( int[] nums : nums2 ) {
//			System.out.printf("nums = %s : %d\n", Arrays.toString(nums), m1.bigDiff(nums));
//		}
		
//		int[][] nums3 = { {1, 2, 3, 4, 100}, {1, 1, 5, 5, 10, 8, 7}, {-10, -4, -2, -4, -2, 0} };
//		for ( int[] nums : nums3 ) {
//			System.out.printf("nums = %s : %d\n", Arrays.toString(nums), m1.centeredAverage(nums));
//		}
		
//		int[][] nums4 = { {1, 2, 2, 1}, {1, 1}, {1, 2, 2, 1, 13}, {1, 2, 13, 2, 1, 13}, {13, 1, 2, 13, 2, 1, 13} };
//		for ( int[] nums : nums4 ) {
//			System.out.printf("nums = %s : %d\n", Arrays.toString(nums), m1.sum13(nums));
//		}
		
//		int[][] nums5 = { {1, 2, 2}, {1, 2, 2, 6, 99, 99, 7}, {1, 1, 6, 7, 2}, {2, 7, 6, 2, 6, 7, 2, 7} };
//		for ( int[] nums : nums5 ) {
//			System.out.printf("nums = %s : %d\n", Arrays.toString(nums), m1.sum67(nums));
//		}
		
//		int[][] nums6 = { {1, 2, 2}, {1, 2, 1, 2}, {2, 1, 2} };
//		for ( int[] nums : nums6 ) {
//			System.out.printf("nums = %s : %b\n", Arrays.toString(nums), m1.has22(nums));
//		}

//		int[][] nums7 = { {0,2,4}, {1, 2, 3}, {1, 2, 4} };
//		for ( int[] nums : nums7 ) {
//			System.out.printf("nums = %s : %b\n", Arrays.toString(nums), m1.lucky13(nums));
//		}

//		int[][] nums8 = { {2, 3, 2, 2, 4, 2}, {2, 3, 2, 2, 4, 2, 2}, {1, 2, 3, 4} };
//		for ( int[] nums : nums8 ) {
//			System.out.printf("nums = %s : %b\n", Arrays.toString(nums), m1.sum28(nums));
//		}

//		int[][] nums9 = { {1, 4, 1}, {1, 4, 1, 4}, {1, 1} };
//		for ( int[] nums : nums9 ) {
//			System.out.printf("nums = %s : %b\n", Arrays.toString(nums), m1.more14(nums));
//		}

//		int[] nums10 = { 4, 1, 10 };
//		for ( int n : nums10 ) {
//			System.out.printf("n = %d : %s\n", n, Arrays.toString(m1.fizzArray(n)));
//		}

//		int[][] nums11 = { {1, 4, 1, 4}, {1, 4, 2, 4}, {1, 1} };
//		for ( int[] nums : nums11 ) {
//			System.out.printf("nums = %s : %b\n", Arrays.toString(nums), m1.only14(nums));
//		}

//		int[] nums12 = { 4, 10, 2 };
//		for ( int n : nums12 ) {
//			System.out.printf("n = %d : %s\n", n, Arrays.toString(m1.fizzArray2(n)));
//		}
		
//		int[][] nums13 = { {1, 2, 3}, {1, 2, 3, 4}, {2, 3, 4} };
//		for ( int[] nums : nums13 ) {
//			System.out.printf("nums = %s : %b\n", Arrays.toString(nums), m1.no14(nums));
//		}
		
//		int[][] nums14 = { {1, 2, 1, 3}, {1, 2, 1, 3}, {1, 2, 1, 3, 4} };
//		int[] vals14 = { 1, 2, 1 };
//		for ( int i = 0; i < nums14.length; i++ ) {
//			System.out.printf("nuns = %s, val = %d : %b\n", Arrays.toString(nums14[i]), vals14[i],
//					m1.isEverywhere(nums14[i], vals14[i]));
//		}
		
//		int[][] nums15 = { {1, 2, 2}, {4, 4, 1}, {4, 4, 1, 2, 2} };
//		for ( int[] nums : nums15 ) {
//			System.out.printf("nums = %s : %b\n", Arrays.toString(nums), m1.either24(nums));
//		}
		
//		int [][][] nums16 = { { {1, 2, 3}, {2, 3, 10} }, { {1, 2, 3}, {2, 3, 5} }, { {1, 2, 3}, {2, 3, 3} } };
//		for ( int[][] nums : nums16 ) {
//			System.out.printf("nums1 = %s, nums2 = %s : %d\n", Arrays.toString(nums[0]), Arrays.toString(nums[1]), 
//					m1.matchUp(nums[0], nums[1]));
//		}
		
//		int [][] nums17 = { {1, 7, 7}, {1, 7, 1, 7}, {1, 7, 1, 1, 7}, {7, 1, 7}, 
//				{7, 7, 1, 1, 7}, {2, 7, 2, 2, 7, 7}, {7, 7, 1, 1, 7}, {7, 2, 7, 2, 2, 7} };
//		for ( int[] nums : nums17 ) {
//			System.out.printf("nums = %s : %b\n", Arrays.toString(nums), m1.has77(nums));
//		}

//		nums18 starts m2
		
//		int[][] nums18 = { {1, 3, 2}, {3, 1, 2}, {3, 1, 4, 5, 2} };
//		for ( int[] nums : nums18 ) {
//			System.out.printf("nums = %s : %b\n", Arrays.toString(nums), m2.has12(nums));
//		}
		
//		int[][] nums19 = { {2, 1, 3, 5}, {2, 1, 2, 5}, {2, 4, 2, 5} };
//		for ( int[] nums : nums19 ) {
//			System.out.printf("nums = %s : %b\n", ats(nums), m2.modThree(nums));
//		}
		
//		int[][] nums20 = { {3, 1, 3, 1, 3}, {3, 1, 3, 3}, {3, 4, 3, 3, 4}, {1, 3, 3, 1, 3} } ;
//		for ( int[] nums : nums20 ) {
//			System.out.printf("nums = %s : %b\n", ats(nums), m2.haveThree(nums));
//		}
		
		int[][] nums21 = { {4, 2, 2, 3}, {2, 2, 4}, {2, 2, 4, 2}, {1, 2, 3, 4} };
		for ( int[] nums : nums21 ) {
			System.out.printf("nums = %s : %b\n", ats(nums), m2.twoTwo(nums));	
		}
		
	}
	
	private String ats(int[] nums) {
		return Arrays.toString(nums);
	}

}
