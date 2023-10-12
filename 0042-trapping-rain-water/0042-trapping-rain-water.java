public class Solution {
    public int trap(int[] h) {
        int l = 0, r = h.length - 1;
        int lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE;
        int ans = 0;
        while (l < r) {
        lmax = Math.max(lmax, h[l]);
        rmax = Math.max(rmax, h[r]);
        if (lmax < rmax) {
                ans += lmax - h[l++];
        } else {
                ans += rmax - h[r--];
        }        
    }
        return ans;
    }
}