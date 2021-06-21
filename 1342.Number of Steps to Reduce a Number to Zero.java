public class Number_of_Steps_to_Reduce_a_Number_to_Zero {

	public static void main(String[] args) {
		int num=14;
		int count=0;
	while(num>0)
	 {
		if(num%2==0)
	     {num=num/2;
	        count++;}
	        else
	       {num=num-1;
	        count++;}
	 }
		System.out.println(count);
	        
	}

}
