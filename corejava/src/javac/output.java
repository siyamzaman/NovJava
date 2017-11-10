package javac;

import java.util.Scanner;

public class output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader = new Scanner(System.in);
System.out.println(" What is your name? ");
String name =reader.next();



Scanner reader1 = new Scanner(System.in);
System.out.println(" What is your Age?  Type here : ");
int age =reader1.nextInt();

Scanner reader2 = new Scanner(System.in);
System.out.println(" What is your Hobby ?  Type here : ");
String hobby =reader2.next();

Scanner reader3 = new Scanner(System.in);
System.out.println(" What is your Hobby ?  Type here : ");
String city =reader3.next();



System.out.println("Your name is :" + name);
System.out.println("Your Age is :" + age);
System.out.println("Your Hobby is playing :" + hobby);
System.out.println("You are from the city of  :" + city);
	}

}
