class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int temp;
        for(int upperbound = nums.length-1; upperbound >=2; --upperbound)
        {
            temp = nums[upperbound-1] + nums[upperbound-2];
            if(temp>nums[upperbound]) 
                return (nums[upperbound] + temp);
        }
        return 0; //impossible to form
    }
}