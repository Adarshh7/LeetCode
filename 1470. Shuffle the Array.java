import java.util.*;

public class Shuffle_the_Array{

	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		 int n=z.nextInt();
		   int nums[]= {2,5,1,3,4,7};
		   int r[]=new int[2*n];
	        int nums1[]=Arrays.copyOfRange(nums, 0, n);
	        int nums2[] = Arrays.copyOfRange(nums, n,2*n);
	        int i=0,j=0;
	    while( i<2*n)
	    {
	       r[i]=nums1[j];
	       r[i+1]=nums2[j];
	       i=i+2;
	       j++;       
	    }
	    for(int k=0;k<r.length;k++)
        {
        	System.out.println(r[k]);
        }  
	    }
	}