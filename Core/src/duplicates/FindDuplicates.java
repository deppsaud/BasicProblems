package duplicates;

public class FindDuplicates {
	public static void main(String[] args) {
		
		String statement = new String("hello k cha solti");
		
		int count = 0;
		char[] duplicates = statement.toCharArray();
		for(int i=0;i<duplicates.length;i++)
		{
			for(int j=i+1;j<duplicates.length;j++)
			{
				if(duplicates[i]== duplicates[j])
				{
					System.out.println(duplicates[j]);
					count++;
				}
				
			}
			
		}System.out.println("duplicates are : "+ count);
	}
}
