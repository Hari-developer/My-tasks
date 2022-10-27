
public class constructor {
	int number;
	String name;
	constructor(int number,String name)
	{
		 this.name=name;
		 this.number=number;
		System.out.println("welcome");
	}
	
	public static void main(String args[])
	{
		constructor jar=new constructor(143, "kavya");
		System.out.println(jar.name);
		System.out.println(jar.number);
		
	}
	
}
