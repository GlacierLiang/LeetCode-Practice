class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int length = nums.length;
        int[] answer = new int[length];
        
        for(int i = 0; i < length; left *= nums[i], i++)
        {
            answer[i] = left;
        }
        
        for(int i = length-1; i >= 0;right *= nums[i], i--)
        {
            answer[i] *= right;
        }
        
        return answer;
    }
}