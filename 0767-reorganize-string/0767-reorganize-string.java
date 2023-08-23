class Solution {
    public String reorganizeString(String s) {
        int[] count = new int[26];
        int maxNumber = 0;
        int temp = 0;
        int length = s.length();
        
        for(char c: s.toCharArray())
        {
            temp = c - 'a';
            count[temp] ++;
            maxNumber = Math.max(maxNumber, count[temp]);
        }
        
        if(maxNumber > ((length+1)/2))
        {
            return "";
        }
        
        // count number of different characters
        temp = 0;
        for(int v : count)
        {
            if(v>0) temp++;
        }
        
        // store them into (letter, number) form
        int[][] myArr = new int[temp][2];
        temp = 0;
        
        for(int i = 0; i<26; i++)
        {
            if(count[i]>0)
            {
                myArr[temp++] = new int[]{count[i],i};
            }
        }
        
        // sort
        Arrays.sort(myArr, (a, b) -> b[0] - a[0]);
        temp = 0;
        
        // construct the string
        StringBuilder ans = new StringBuilder(s);
        for (int[] e : myArr) {
            int v = e[0];
            int i = e[1];
            while (v-- > 0) {
                ans.setCharAt(temp, (char) ('a' + i));
                temp += 2;
                if (temp >= length) {
                    temp = 1;
                }
            }
        }
        return ans.toString();
    }
}