import java.math.*;
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) 
            return Integer.MAX_VALUE;
        int result = dividend / divisor;
        return result;
    }
}