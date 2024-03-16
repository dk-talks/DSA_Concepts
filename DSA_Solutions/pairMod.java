class Solution {
    public boolean canArrange(int[] arr, int k) {
        // Brute force - Consider every pair and count. TC - O(n^2)
        // Optimisation - Important observation is - range is from -k+1 to K, we can use it.
        int n = arr.length;
        HashMap<Integer, Integer> rangeMap = new HashMap<>();
        for(int num: arr) {
            rangeMap.put((num%k+k)%k, rangeMap.getOrDefault((num%k+k)%k, 0)+1);
        }

        if(rangeMap.containsKey(0)) {
            int freq = rangeMap.get(0);
            if(freq % 2 == 1) {
                return false;
            }
        }

        for(int key: rangeMap.keySet()) {
            if(key == 0) {
                continue;
            }
            int freq1 = rangeMap.get(key);
            int freq2 = 0;
            if(rangeMap.containsKey(k-key)) {
                freq2 = rangeMap.get(k-key);
            }

            if(freq1 != freq2) {
                return false;
            }
        }

        return true;
    }
}
