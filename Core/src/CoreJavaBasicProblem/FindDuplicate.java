package coreJavaBasicProblem;

public class FindDuplicate {

	public static void main(String[] args) {
		String sentence = "how many duplicate are there?";
		System.out.println("Original Sentence : "+sentence);
		
		String characters = "";
		String duplicates = "";
		for(int i=0;i<sentence.length();i++)
		{
			String current = Character.toString(sentence.charAt(i));
			
		
			if(characters.contains(current)) 
			{
				if(!duplicates.contains(current))
				{
					duplicates += current + ",";
				}
			}
			characters +=  current;
			
		}
			System.out.println(duplicates);
	}
}