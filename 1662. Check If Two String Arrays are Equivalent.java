class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	    StringBuilder s=new StringBuilder(); 
	    StringBuilder s1=new StringBuilder();
        boolean b=false;
	    for(int i=0;i<word1.length;i++)
	    {
	    	s.append(word1[i]);
	    }
	    for(int i=0;i<word2.length;i++)
	    {
	    	s1.append(word2[i]);
	    }
	    
	   if(s.toString().equals(s1.toString()))  
           b=true;
        
        return b;
    }
}
