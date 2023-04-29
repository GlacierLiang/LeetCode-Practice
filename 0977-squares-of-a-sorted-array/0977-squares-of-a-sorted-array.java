class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i;
        for(int count = 0; count<n; count ++)
        {
            i = nums[count];
            nums[count] = i * i;
        }
        
        Arrays.sort(nums);
        return nums;
    }
}