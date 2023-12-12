class Solution {
public:
    vector<string> buildArray(vector<int>& target, int n) {
        vector<string> result;
        stack<int> st;
        int curr = 1;
        for (int num : target) {
            while (curr < num) {
                st.push(curr);
                result.push_back("Push");
                result.push_back("Pop");
                curr++;
            }
            st.push(num);
            result.push_back("Push");
            curr++;
        }
        return result;
    }
};
