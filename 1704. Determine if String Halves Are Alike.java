class Solution {
    public boolean halvesAreAlike(String s) {
       int n=s.length();
		int count=0,count1=0;
		String s1=s.substring(0,n/2);
		s1=s1.toLowerCase();
		String s2=s.substring(n/2,n);
		s2=s2.toLowerCase();
		char c[]= {'a','e','i','o','u'};
		for(int i=0;i<s1.length();i++)
		{
		 for(int j=0;j<c.length;j++)
			{
			 char c1=s1.charAt(i);
			 char c2=s2.charAt(i);
			  if(c1==c[j])
				{count++;}
			  if(c2==c[j])
				 {count1++;}
			} 
		}
		if(count==count1)
			return true; 
        else
            return false;
    
    }
}
