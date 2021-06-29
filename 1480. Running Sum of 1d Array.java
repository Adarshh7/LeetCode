class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int Sum[]=new int[n];
        Sum[0]=nums[0];
   for(int i=1;i<n;i++)    
   {
       Sum[i]=Sum[i-1]+nums[i];
   }
        return Sum;
    }
}
