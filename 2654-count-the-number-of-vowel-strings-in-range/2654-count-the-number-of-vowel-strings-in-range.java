class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isVowelString(words[i])) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isVowelString(String word) {
        char firstChar = Character.toLowerCase(word.charAt(0));
        char lastChar = Character.toLowerCase(word.charAt(word.length() - 1));
        return isVowel(firstChar) && isVowel(lastChar);
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
