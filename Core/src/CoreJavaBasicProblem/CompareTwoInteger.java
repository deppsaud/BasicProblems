package coreJavaBasicProblem;

public class CompareTwoInteger {
	public static void main(String[] args) {
		
//		Integer num1 = 198;
//		Integer num2 = 198;
		
		compare(100,100);
		compare(199,199);
		
		
	}
		public static Integer compare(Integer input1, Integer input2)
		{
			if(input1 == input2)
			{
				System.out.println("both are equal");
			}else {
				System.out.println("both are not equal");
			}
			
			return 0;
		}
	

}
