class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int le = 0;
        int re = 0;
        
        for(int counter = 0; counter < nums.length; counter++)
            sum+=nums[counter];
        
        for(int counter = 0; counter < nums.length; counter++)
        {
            re = sum - nums[counter] - le;
            
            if(le == re)
                return counter;
            else
                le += nums[counter];
        }
        
        return -1;
    }
}