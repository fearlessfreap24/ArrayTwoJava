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
		
		int[][] nums3 = { {1, 2, 3, 4, 100}, {1, 1, 5, 5, 10, 8, 7}, {-10, -4, -2, -4, -2, 0} };
		for ( int[] nums : nums3 ) {
			System.out.printf("nums = %s : %d\n", Arrays.toString(nums), m1.centeredAverage(nums));
		}
		
	}

}
