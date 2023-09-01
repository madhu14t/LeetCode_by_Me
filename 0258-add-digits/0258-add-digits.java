class Solution {
    public int addDigits(int num) {
        if(num==0)
        return 0;
        else if(num<=9)
        return num;
        else
        {
            int s=0;
            while(num>0)
            {
                int k = num%10;
                s = s+k;
                num = num/10;
            }
            return addDigits(s);
        }
    }
}