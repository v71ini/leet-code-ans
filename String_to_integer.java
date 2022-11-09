class Solution {
    public int myAtoi(String s) {
        int result=0;  
        int i=0;
        int sign=1;
    
        while(i<s.length()&&s.charAt(i)==' ')i++;  
        if(i==s.length())return 0;
        if(s.charAt(i)=='-'||s.charAt(i)=='+')      
        {
            sign=s.charAt(i)=='-'?-1:1;
            i++;
        }
        while(i<s.length()&&(s.charAt(i)>='0'&&s.charAt(i)<='9'))  
        {
            int digit=(s.charAt(i)-'0')*sign;
            if(sign==1 && (result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10))) return Integer.MAX_VALUE; 
            if(sign==-1 &&(result<Integer.MIN_VALUE/10 || (result==Integer.MIN_VALUE/10 && digit<Integer.MIN_VALUE%10))) return Integer.MIN_VALUE; 
            
            result=result*10+digit; 
            i++;
        }
    
    return result;
    }
}
