class Solution {
    public boolean canJump(int[] nums) {
        int reach = nums[0];
        for(int i = 0; i < nums.length && i <= reach; i++)
        {
            if(i+nums[i] > reach)
            {
                reach = i + nums[i];
            }
        }
        return reach>=(nums.length-1)? true:false;
    }
}