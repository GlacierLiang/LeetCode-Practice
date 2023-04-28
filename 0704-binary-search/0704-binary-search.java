class Solution {
    public int search(int[] nums, int target) {
        int lower_bound = 0;
        int upper_bound = nums.length-1;
        int mid = (lower_bound+upper_bound)/2;
        int midtemp;
        int temp = nums[mid];
        
        if(nums[lower_bound] == target)
            return lower_bound;
        else if(nums[upper_bound] == target)
            return upper_bound;
        
        //maybe exists in between
        while(temp != target)
        {
            if(temp <= target)
            {
                lower_bound = mid;
            }else
            {
                upper_bound = mid;
            }
            midtemp = (lower_bound+upper_bound)/2;
            
            if(midtemp == mid) return -1;
            
            mid=midtemp;
            temp = nums[mid];
        }
        
        return mid;
    }
}