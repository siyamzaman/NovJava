package javac;

import java.util.Scanner;

public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
		
		Scanner reader=new Scanner (System.in);

System.out.println(" give first integer");

int n= reader.nextInt();

Scanner reader1=new Scanner (System.in);

System.out.println(" give second integer");

int m= reader1.nextInt();


int sum=n+m;

System.out.println("Sum is  =  "+sum);



	

	} catch(Exception e) 
		{ System.out.println("Enter An Integer");

}
	}}
