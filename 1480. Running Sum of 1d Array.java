public class runningsum {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4};
		int n=nums.length;
		int runningSum[]=new int[n];
	    runningSum[0]=nums[0];
	    for(int i=1;i<n;i++)    
	    {
	        runningSum[i]=runningSum[i-1]+nums[i];
	    }
	        for(int j=0;j<runningSum.length;j++)
	        {
	        	System.out.println(runningSum[j]);
	        }
	     } 

}
