class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap();
        
        for(int counter = 0; counter < nums.length; counter++)
        {
            if(map.containsKey(nums[counter]))
                return true;
            else
                map.put(nums[counter],1);
        }
        return false;
    }
}