class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int m=accounts[0].length;
        int sum[]=new int[n];
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=0;j<m;j++){
                s=s+accounts[i][j];
            }
            sum[i]=s;
              }
            int high=sum[0];
        for(int k=0;k<n;k++)
            {
            	if(sum[k]>high)
            		high=sum[k];
            }  
     return high;
    }
}
