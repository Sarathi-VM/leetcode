package leetCode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums= {2,3,4,8,10};
		int target=12;
		System.out.println(searchInsert(nums,target));
	}

	public static int searchInsert(int[] nums, int target) {
		int start=0;
		int end=nums.length-1;
		if(target<nums[0]) {
			return start;
		}
		while(start<=end) {
			int mid=(start+end)/2;
			if(mid<nums.length && target==nums[mid]) {
				return mid;
			}
			else if(mid<nums.length && target>nums[mid]) {
				start=mid+1;
				if( start<nums.length && target==nums[start]) return start;
			}
			else {
				end=mid-1;
				if(end<nums.length && target==nums[end]) return end;
			}
		}
		return start;
	}	
}

