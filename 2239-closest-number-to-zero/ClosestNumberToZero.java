import java.lang.Math;

class ClosestNumberToZero {
	public static void main(String[] args) {
		int[] list = {10,-9,6,-5,-1,4,10};
		System.out.println(closestNumberToZero(list));
	}

	public static int closestNumberToZero(int[] nums) {
		int result = nums[0];
		for (int num: nums) {
			if (Math.abs(num) < Math.abs(result)) {
				result = num;
			} else if (Math.abs(num) == Math.abs(result)) {
				result = (num > result) ? num : result;
			}
		}
		return result;
	}
}
