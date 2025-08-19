package CodingRoundIV;

public class leetcode2348retry {
	public static void main(String[] args) {
		int[] nums = { 0, 0, 0, 2, 0, 0 };
		System.out.println(zeroFilledSubarray(nums));
	}

	public static long zeroFilledSubarray(int[] nums) {
		long count = 0;
		long ans = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count++;
				ans+=count;
			}
			else {
				count=0;
			}
		}
		return ans;
	}
}
