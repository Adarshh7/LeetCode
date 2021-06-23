public class Count of Matches in Tournament {

	public static void main(String[] args) {
		int n=7,m=0;
		 while(n!=1) 
		  { 
			 if(n%2==0)  
		      {
		       n=n/2;
		       m=m+n/2;
		      }
		    else
		       {
		       m=m+(n-1)/2;
		       n=((n-1)/2)+1;
		       }
		  }
		 System.out.println(m);
	}

}
