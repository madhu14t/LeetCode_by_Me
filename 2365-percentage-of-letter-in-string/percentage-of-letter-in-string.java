class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)==letter){
                count++;
            }
        }
        int res = (count * 100) / len;
        return res;
    }
}