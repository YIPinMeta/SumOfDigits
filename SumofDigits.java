package day6;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// Add Sum of digits in a number e.g (345 > sum is 12)

		
		Scanner scanner = new Scanner(System.in);
		
		// int temp= num/10; -To remove the last number
		//int temp = num%10; -To get the last number
		
		System.out.println(" Enter a number ");
		int num =scanner.nextInt();
		int sum=0;
		
		while (num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of Digits: " +sum );
	}

}
//Debugging@ 1:25:02