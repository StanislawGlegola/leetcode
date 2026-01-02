import java.lang.Math;

class ClosestNumberToZero {
	public static void main(String[] args) {
		int[] list = {10,-9,6,-5,-1,4,10};
		System.out.println(closestNumberToZero(list));
	}

	public static int closestNumberToZero(int[] nums) {
		int closest = nums[0];
		for (int num: nums) {
			if (Math.abs(num) < Math.abs(closest)) {
				closest = num;
			} else if (Math.abs(num) == Math.abs(closest)) {
				closest = (num > closest) ? num : closest;
			}
		}
		return closest;
	}
}
