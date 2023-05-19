class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>(); 
        
        while(!set.contains(n))
        {
            set.add(n);
            n = countSum(n);
            
            if(n == 1) return true;
        }
        return false;
    }
    
    public int countSum(int n)
    {
        int ans = 0;
        int temp;
        while(n>0)
        {
            temp = n % 10;
            ans += (temp*temp);
            n = n / 10;
        }
        return ans;
    }
}