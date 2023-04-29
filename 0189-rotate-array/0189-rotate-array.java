class Solution {
    public void rotate(int[] nums, int k) {
        int[] clone = nums.clone();
        int length = nums.length;
        int temp = k%length;
        
        for(int count = 0; count<length; count++)
            nums[(count+temp)%length] = clone[count];
        
    }
}