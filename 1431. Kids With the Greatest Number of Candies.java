class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
   ArrayList<Boolean> List = new ArrayList<Boolean>();
   int max=candies[0];
        for(int i=0;i<candies.length;i++)
        {
           if(candies[i]>max)
               max=candies[i];
        }
        for(int i=0;i<candies.length;i++)
        {
           if((candies[i]+extraCandies)>=max) 
              List.add(true);
            else
              List.add(false);
        }
        return List;   
    }
}
