package javac;

import java.util.Scanner;

public class hm_cencus_1021 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader =new Scanner(System.in);
		System.out.println(" Enter your name: ");
		
		String n= reader.next();
		
		System.out.println(" Enter your Age : ");
		
		int a= reader.nextInt();

		System.out.println(" Enter your Occupation : ");
		
		String o= reader.next();
		
		System.out.println(" Your Name  is : " +n);
		System.out.println(" Your Age  is : "+a );		
System.out.println(" Your Occupation  is : "+ o);
		
		
		
//		Scanner reader = new Scanner(System.in);
//		System.out.println(" provide your first integer");
//		
//		int n=reader.nextInt();
//		System.out.println(" provide your second integer");
//		
//		int p=reader.nextInt();
//		
//		System.out.println(" provide your third integer");
//		
//		int q=reader.nextInt();
//		
//		int sum=n+p+q;
//		
//		System.out.println(" the sum is :"+sum);
	}

}
