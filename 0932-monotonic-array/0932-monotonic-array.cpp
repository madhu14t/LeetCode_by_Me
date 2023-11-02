class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        int direction = 0;
        for (int i = 1; i < nums.size(); i++) {
            int diff = nums[i] - nums[i - 1];
            if (diff != 0) {
                if (direction == 0) {
                    direction = diff;
                } else if (direction > 0 && diff < 0) {
                    return false;
                } else if (direction < 0 && diff > 0) {
                    return false;
                }
            }
        }

        return true;
    }
};