package javac;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum();
argument_sum(7,8);
argument_sub(9,1);
	}

	
	
	
	
	public static void sum()
	{
		
		int add=8+9;
		System.out.println(add);
	}
	
	
	public static void argument_sum(int a, int b)
	
	{
	int adding=a+b;
	System.out.println(adding);
	}
	
public static void argument_sub(int a, int b)
	
	{
	int sub=a-b;
	System.out.println(sub);
}
}