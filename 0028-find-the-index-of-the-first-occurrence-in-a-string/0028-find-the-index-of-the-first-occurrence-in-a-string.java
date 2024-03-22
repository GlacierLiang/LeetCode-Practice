class Solution {
    public int strStr(String haystack, String needle) {
        int lengthmax = haystack.length()-needle.length();
        
        if(lengthmax<0) return -1;
        
        for(int i = 0; i <= lengthmax; i++)
        {
            for(int temp = i;temp < needle.length()+i; temp++)
            {
                if(haystack.charAt(temp) != (needle.charAt(temp-i)))
                    break;
                if(haystack.charAt(temp) ==(needle.charAt(temp-i)) && (temp-i) == needle.length()-1)
                    return i;
            }
        }
            
        return -1;
    }
}