class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() == 1) return true;
        
        HashMap<Character, Character> map = new HashMap<>();
        char a;
        char b;
        
        for(int c = 0; c<s.length();c++)
        {
            a = s.charAt(c);
            b = t.charAt(c);
            
            if(map.containsKey(a))
            {
                if (!map.get(a).equals(b))
                    return false;
            }else
            {
                if(map.containsValue(b))
                    return false;
                else
                    map.put(a,b);
            }
        }
        
        return true;
    }
}