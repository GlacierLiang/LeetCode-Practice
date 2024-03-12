class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int temp;
        
        for(int count:nums)
        {
            if(count != val)
                nums[k++] = count;
        }
        return k;
    }
}