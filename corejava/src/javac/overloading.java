package javac;
//overloading is both of the function name are same but have different argument
public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		number (6);
		number(6.7);
		String("rose");
		String("flower");
	}
public static void numbers( int c) {
	System.out.println(c);
}


public static void number(double c)
{
	System.out.println(c);
}

public static void String (String rose) {

	System.out.println(rose);
}
public static void number (String rose) {

	System.out.println(rose);

	
}
}