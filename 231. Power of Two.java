public class Power_of_Two  {

	public static void main(String[] args) {
  int n=2147483647,i=0; long x=0;
boolean b=false;
  while(x<n)
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
  System.out.println(b);  
	}

}
