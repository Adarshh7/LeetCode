class Solution {
    public boolean isPowerOfTwo(int n) {
boolean b=false;
        int i=0; long x=0;
    while(x<=n)
  {
   x=(long)Math.pow(2, i);
   i++;
  if(x==n)
  {
	  b=true;
	  break;
  }
  else 
	  continue;
   } 
        return b;      
  
    }
}
