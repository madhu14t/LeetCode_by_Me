class Solution {
    public int maximum69Number (int num) 
    {
        String s = String.valueOf(num);
        char a[] = s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='6')
            {
                a[i] = '9';
                break;
            }
        }      
        int number = Integer.parseInt(new String(a));

        return number;
    }
}