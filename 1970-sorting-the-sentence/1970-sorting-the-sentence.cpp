class Solution {
public:
    string sortSentence(string s) {
        vector<string> words;
        stringstream ss(s);
        string word;
        while (getline(ss, word, ' ')) {
            words.push_back(word);
        }
        sort(words.begin(), words.end(), [](const string& a, const string& b) {
            return a.back() < b.back();
        });
        for (string& word : words) {
            word.pop_back();
        }
        string result = "";
        for (const string& word : words) {
            result += word + " ";
        }
        result.pop_back();
        
        return result;
    }
};
