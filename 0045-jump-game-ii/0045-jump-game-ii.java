class Solution {
    public int jump(int[] nums) {
        
        int reach = 0;
        int previousJump = 0;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(i > reach)
            {
                return -1;
            }
            
            if(i > previousJump)
            {
                count++;
                previousJump = reach;
            }
            
            if(i+nums[i] > reach)
            {
                reach = i + nums[i];
            }
        }
        return count;
    }
}