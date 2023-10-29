class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] m= sentence.split(" ");
        System.out.println(Arrays.toString(m));
        int i=0;
        for(String s:m){
            i++;
            if(s.startsWith(searchWord)){
                return i;
            }
        }
        return -1;
    }
}