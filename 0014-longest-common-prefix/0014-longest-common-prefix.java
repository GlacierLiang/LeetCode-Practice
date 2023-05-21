class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        
        for(int i = 0; i< strs[0].length(); i++)
        {
            for(int j = 0; j<length;j++)
            {
                if(strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i))
                    return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}