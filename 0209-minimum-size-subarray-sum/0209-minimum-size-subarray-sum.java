class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlength = nums.length+1;
        int temp = 0;
        int j = 0;
        
        for(int i = 0; i < nums.length;i++)
        {
            temp += nums[i];
            while(temp >= target)
            {
                minlength = Math.min(minlength,(i-j+1));
                temp -= nums[j++];
            }
        }
        
        return (minlength == (nums.length+1)) ? 0:minlength;
    }
}