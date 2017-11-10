package javac;

public class constructor {
	
	int age;
	int salary;
	int  house;
	String name;
	
	
	constructor(){
		
		
		int age=23;           // in this constructor method we are giving new value and 
		int salary=200;
		int house= 2;
		String name= "john";
		
		
		System.out.println(age);
		System.out.println(salary);
		System.out.println(house);
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor x= new constructor();// we are executing the constructor method with this object

	}

}
 