public class Jewels_and_Stones  {
	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		int count=0;
		for(int i=0;i<stones.length();i++)
		{
			for(int j=0;j<jewels.length();j++)
			{
			if(jewels.charAt(j)==stones.charAt(i))
			{
				count++;
			}
		}
		 }
		System.out.println(count);
	}

}
