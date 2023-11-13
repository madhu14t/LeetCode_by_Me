class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] s = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> m = new HashSet<>();
        
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(s[c - 'a']);
            }
            m.add(sb.toString());
        }
        
        return m.size();
    }
}
