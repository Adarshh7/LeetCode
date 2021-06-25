class Solution {
    public int lengthOfLastWord(String s) {
        
      String[] ar=s.split("\\s");
        if(ar.length==0)
            return 0;
        int n=ar[ar.length-1].trim().length();
        return n;
	}
    
}
