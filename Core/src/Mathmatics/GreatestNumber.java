package Mathmatics;

import java.util.Scanner;

public class GreatestNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int[] numArray = new int[size];
		System.out.println("enter the array element");
		for(int i=0;i<size;i++)
		{
			numArray[i] = sc.nextInt(); 
		}
		
		System.out.println("the given array is");
		System.out.printf("[");
		for(int i=0;i<size;i++)
		{
			System.out.printf( numArray[i]+",");
		}
		System.out.printf("]");
		System.out.println("\n"+"------------------------------");
		
		int max = numArray[0];
		for(int i=0;i<size;i++)
		{
			if(numArray[i]>max)
			{
				max = numArray[i];
			}
		}
		System.out.println("the greatest number is : "+ max);
		
	}

}
