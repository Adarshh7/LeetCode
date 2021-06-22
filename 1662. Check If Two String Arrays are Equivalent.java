public class Check If Two String Arrays are Equivalent {
	public static void main(String[] args) {
		String word1[] = {"ab", "c"}; 
	    String word2[] = {"a", "bc"};
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
	  
	   System.out.println(b);
	    
	}

}
