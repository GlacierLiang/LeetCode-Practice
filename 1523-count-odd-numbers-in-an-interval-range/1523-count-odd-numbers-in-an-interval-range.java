class Solution {
    public int countOdds(int low, int high) {
        int sum = high-low;
        int count = (sum+1)/2;
        if(low%2 == 1 && high%2 == 1)count++;
        return count;
    }
}