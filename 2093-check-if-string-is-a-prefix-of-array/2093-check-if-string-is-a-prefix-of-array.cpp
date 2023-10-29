class Solution {
public:
    bool isPrefixString(string s, vector<string>& words) {
        string result;
        for (string word : words) {
            result += word;
            if (result == s) {
                return true;
            }
            if (result.size() > s.size()) {
                return false;
            }
        }
        return false;
    }
};
