package two_sum_II_167;

import java.util.Arrays;

public class Solution {

	public int[] twoSum(int[] numbers, int target) {
		// O(n*log(n))
		int low = 0;
		int high = numbers.length - 1;
		while(low < high) {
			int sum = numbers[low] + numbers[high];
			if (sum == target) {
				return new int[]{low + 1, high + 1};
			} else if (sum < target) {
				low++;
			} else {
				high--;
			}
		}
		return new int[2];
	}

	static void main() {
		int[] numbers = {2,7,11,15};
		int target = 9;
		Solution solution = new Solution();
		printResult( solution, numbers, target );

		numbers = new int[]{2,3,4};
		target = 6;
		printResult( solution, numbers, target );

		numbers = new int[]{-1,0};
		target = -1;
		printResult( solution, numbers, target );

	}

	private static void printResult( Solution solution, int[] numbers, int target ) {
		System.out.println( getResult( solution, numbers, target ) );
		System.out.println("------------");
	}

	private static String getResult( Solution solution, int[] numbers, int target ) {
		return Arrays.toString( solution.twoSum( numbers, target ) );
	}

}
