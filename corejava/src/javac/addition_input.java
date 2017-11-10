package javac;

import java.util.Scanner;

public class addition_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner reader = new Scanner(System.in);
		System.out.println(" provide your first integer");
		
		int n=reader.nextInt();
		System.out.println(" provide your second integer");
		
		int p=reader.nextInt();
		
		System.out.println(" provide your third integer");
		
		int q=reader.nextInt();
		
		int sum=n+p+q;
		
		System.out.println(" the sum is :"+sum);
		
		
		
		
		
	}

}
