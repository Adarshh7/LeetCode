import java.util.*;
public class  Kids_With_the_Greatest_Number_of_Candies {

	public static void main(String[] args) {
		ArrayList<Boolean> List = new ArrayList<Boolean>();
		int candies[]= {2,3,5,1,3};
		int extraCandies=3;
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
        System.out.println(List);
	}

}
