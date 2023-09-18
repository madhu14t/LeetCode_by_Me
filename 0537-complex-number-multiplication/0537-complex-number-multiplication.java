class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        
        int a=Integer.parseInt(num1.substring(0,num1.indexOf('+')));
        int b=Integer.parseInt(num1.substring(num1.indexOf('+')+1,num1.indexOf('i')));//for number a+ib
        
        int c=Integer.parseInt(num2.substring(0,num2.indexOf('+')));
        int d=Integer.parseInt(num2.substring(num2.indexOf('+')+1,num2.indexOf('i')));//for number c+id
        
        sb.append(a*c-b*d);
        sb.append('+'+"");
        sb.append(b*c+a*d);
        sb.append('i');
        
        return sb.toString();
    }
}