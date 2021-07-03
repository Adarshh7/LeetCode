class Solution {
    public int[] shuffle(int[] nums, int n) {
        int r[]=new int[n*2];
        int nums1[] = Arrays.copyOfRange(nums, 0, n);
        int nums2[] = Arrays.copyOfRange(nums, n, n*2);
        int i=0,j=0;
    while(i<n*2) 
    {
       r[i]=nums1[j];
       r[i+1]=nums2[j];
        i=i+2;
        j++;
    }
    return r;    
    }
}
