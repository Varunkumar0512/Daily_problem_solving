class Solution {
    public int reverse(int x) {
       int rev=0;
      int copy=x;
      int d=0;
    
      while(copy!=0){
      d=copy%10;
      if(rev>Integer.MAX_VALUE/10|| rev<Integer.MIN_VALUE/10){
        return 0;
      }
        rev=rev*10+(copy%10);
        copy=copy/10;
      } 
    
    
      
      return rev;

    }
}