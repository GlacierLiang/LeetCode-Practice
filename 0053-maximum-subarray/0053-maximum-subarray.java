class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        
        for(int counter = 0; counter < nums.length; counter++)
        {
            if(sum >= 0)
                sum += nums[counter];
            else
                sum = nums[counter];
            
            if(max < sum)
                max = sum;
        }
        return max;
    }
}