class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] counter = new int[26];
        for (char c : p.toCharArray()) {
            ++counter[c - 'a'];
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i + p.length() - 1 < s.length(); ++i) {
            int[] t = Arrays.copyOf(counter, counter.length);
            boolean find = true;
            for (int j = i; j < i + p.length(); ++j) {
                if (--t[s.charAt(j) - 'a'] < 0) {
                    find = false;
                    break;
                }
            }
            if (find) {
                ans.add(i);
            }
        }
        return ans;
    }
}