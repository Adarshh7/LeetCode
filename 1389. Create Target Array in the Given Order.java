import java.util.LinkedList;
public class Create Target Array in the Given Order {

	public static void main(String[] args) {
		int nums[] = {0,1,2,3,4};
		int index[] = {0,1,2,2,1};
		LinkedList<Integer>list = new LinkedList<Integer>();
		int target[]=new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			list.add(index[i], nums[i]);
		}
		
		  Object a[]=list.toArray();
		
		  for (int i=0;i<a.length;i++) 
		  {
	            target[i] = (int)a[i];
	        }
		  for (int i=0;i<target.length;i++) 
		  {
	           System.out.print(target[i]);
	        }
		 
	}

}
