class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int low = 0;
        int high = citations.length -1;
        int mid;
        
        while(low <= high)
        {
            mid = low + (high - low)/2;
            
            if(citations[mid] >= citations.length - mid)
            {
                high = mid -1;
            }else
            {
                low = mid +1;
            }
        }
        
        return citations.length - low;
    }
}