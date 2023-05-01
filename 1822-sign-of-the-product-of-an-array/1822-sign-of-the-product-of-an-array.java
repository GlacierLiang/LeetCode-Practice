class Solution {
    public int arraySign(int[] nums) {
        int ans = 1;
    
        for(int c = 0; c<nums.length;c++)
        {
            if(nums[c] == 0){
                return 0;
            }
            else if(nums[c] <0){
                if(ans > 0)
                        ans = -1;
                else
                        ans = 1;
            }
        }
        return ans;
    }
}