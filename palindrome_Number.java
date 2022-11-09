class Solution {
    public boolean isPalindrome(int x) {
        
       
      if(x < 0  || (x % 10 == 0 && x != 0)){
        return false;
    }
    String s = String.valueOf(x);
    char[] array = s.toCharArray();
    int i = 0;
    while(i <=  array.length - 1 - i){
        if(array[i] != array[array.length - 1 - i]){
            return false;
        }
        i++;
    }
    return true;
}
}

