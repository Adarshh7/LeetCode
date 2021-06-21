public class Number_of_Good_Pairs {

	public static void main(String[] args) {
		int nums[]= {1,2,3,1,1,3};
		  int count=0;
	        for(int i=0;i<nums.length;i++) {
	        for(int j=0;j<i;j++) {
	        	if(nums[j]==nums[i])
	        		count++;
	        }
	        }
	        System.out.println(count);    
	}

}
