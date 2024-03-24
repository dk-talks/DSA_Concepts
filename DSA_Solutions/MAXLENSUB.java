class Solution {
    public int maximumLengthSubstring(String s) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        int i = 0;
        int j = 0;
        
        while(j < s.length()) {
            char cc = s.charAt(j);
            map.put(cc, map.getOrDefault(cc, 0)+1);
            if(map.containsKey(cc)) {
                if(map.get(cc) > 2) {
                    while(i < s.length() && map.get(cc) > 2) {
                        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)-1);
                        i++;
                    }
                }
            }
            j++;
            ans = Math.max(ans, j-i);
        }
        
        return ans;
    }
}
