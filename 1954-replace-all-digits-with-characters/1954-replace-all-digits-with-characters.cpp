class Solution {
public:
    string replaceDigits(string s) {
        for (int i = 1; i < s.length(); i += 2) {
            s[i] = shift(s[i - 1], s[i] - '0');
        }
        return s;
    }
    
    char shift(char c, int x) {
        return c + x;
    }
};
