class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
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
        return target;
    }
}
