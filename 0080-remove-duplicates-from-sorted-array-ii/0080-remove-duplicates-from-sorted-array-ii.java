class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 0;
        int k = 1;
        int temp = nums[0];
        
        for(int i = 1; i<nums.length;i++)
        {
            if(temp != nums[i])
            {
                counter = 0;
                temp = nums[i];
                nums[k++] = nums[i];
            }else
            {
                if(counter == 0)
                {
                    nums[k++] = nums[i];
                    counter = 1;
                }
            }
        }
        return k;
    }
}