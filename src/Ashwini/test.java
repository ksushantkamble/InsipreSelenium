package Ashwini;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int temp,num;
		boolean isprime=true;
		
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		sc.close();
		
		for(int i = 2;i<=num/2; i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isprime=false;
				
				break;
				
			}
			
		}
		if(isprime) 
	        System.out.println(num + "number is prime");
	        else
	            System.out.println(num + "number is not a prime");
	}
}
