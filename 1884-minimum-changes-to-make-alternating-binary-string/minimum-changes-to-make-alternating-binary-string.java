class Solution {
    public int minOperations(String s) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    b++;
                } else {
                    a++;
                }
            } else {
                if (s.charAt(i) == '1') {
                    b++;
                } else {
                    a++;
                }
            }
        }
        return Math.min(a, b);
    }
}