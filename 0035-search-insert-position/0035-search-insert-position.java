class Solution {
    public int searchInsert(int[] nums, int target) {
        int lower = 0;
        int upper = nums.length-1;
        
        while(upper != lower)
        {
            int mid = lower + (upper-lower)/2;
            if(nums[mid] >= target)
                upper = mid;
            else
                lower = mid+1;
        }
        
        if(nums[upper] >= target)
            return upper;
        else
            return upper+1;
    }
}