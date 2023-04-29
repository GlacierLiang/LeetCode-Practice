class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int count = 0; count<nums.length; count ++)
            nums[count] *= nums[count];
        
        Arrays.sort(nums);
        return nums;
    }
}