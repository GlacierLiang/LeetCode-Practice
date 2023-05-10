class Solution {
    private int[] f;
    private int[] nums;

    public int rob(int[] nums) {
        this.nums = nums;
        f = new int[nums.length];
        Arrays.fill(f, -1);
        return dfs(0);
    }

    private int dfs(int i) {
        if (i >= nums.length) {
            return 0;
        }
        if (f[i] != -1) {
            return f[i];
        }
        f[i] = Math.max(nums[i] + dfs(i + 2), dfs(i + 1));
        return f[i];
    }
}