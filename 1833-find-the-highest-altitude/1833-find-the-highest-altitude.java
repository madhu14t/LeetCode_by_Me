class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int curAlt = 0;
        
        for (int i = 0; i < gain.length; i++) {
            curAlt += gain[i];
            maxAlt = Math.max(maxAlt, curAlt);
        }
        
        return maxAlt;
    }
}