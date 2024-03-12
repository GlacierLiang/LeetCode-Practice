class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int pos = nums.length/2;
        return nums[pos];
    }
}