
public class Parametrized {
	int id;
	String name;
	
	Parametrized(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		Parametrized emp=new Parametrized(2,"ram");
      System.out.println(emp.id+" "+emp.name);
	}

}
