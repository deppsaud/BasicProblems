package stringQuestions;

public class CharOccurrenceCountStreams {

	/*
	 * Count the number of occurrence of a given Character in a string
	 * */
	
	public static void main(String[] args) {
		String str = "Testing Soultions";
		long count = str
						.chars()
							.filter(e -> (char)e == 'i')
								.count();
		
		System.out.println(count);
	}
}
