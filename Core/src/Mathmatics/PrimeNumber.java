package Mathmatics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		
		System.out.println("enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		findPrime(num);
		
	}
	public static void findPrime(int number)
	{
		boolean isPrime = true;
		if(number<0)
		{
			System.out.println("prime number cannot be negative");
			isPrime = false;
			
		}else if(number <2)
		{
			
			isPrime = false;
		}else {
			for(int i=2;i<=Math.sqrt(number);i++)
			{
				if(number%i == 0)
				{
					isPrime=false;
					break;
				
				}
			}
		}
		if(isPrime == true)
		{
			System.out.println("this is a prime number");
		}else {
			System.out.println("this is a not prime number");
		}
	}
	
}
