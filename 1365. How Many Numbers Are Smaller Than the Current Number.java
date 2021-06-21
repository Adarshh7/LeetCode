public class How_Many_Numbers_Are_Smaller{

	public static void main(String[] args) {
		int nums[]= {8,1,2,2,3};
		int r[]=new int[nums.length];
		  for(int i=0;i<nums.length;i++)
		  {
		      int count=0;
		    for(int j=0;j<nums.length;j++)
		    {
		    if(nums[j]<nums[i])
		        count++;
		    }
		      r[i]=count;
		  }
		for(int i=0;i<r.length;i++) 
		{
			System.out.print(r[i]);
		}
	}

}
