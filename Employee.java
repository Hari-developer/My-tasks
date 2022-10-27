import java.io.*;


public class Employee {

	int id,salary;
	String name;
	
	
    void	setData() throws IOException
	{

		BufferedReader  bf=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the id");
		String s=bf.readLine();
		id=Integer.parseInt(s);
		System.out.println("Enter the name");
		 name=bf.readLine();
		 System.out.println("enter the salary");
		 s=bf.readLine();
		 salary=Integer.parseInt(s);
		
	}
	void showData()
	{
		System.out.println("Id      :"+id);
		System.out.println("Name    :"+name);
		System.out.println("Salary  :"+salary);
	}

	public static void main(String[] args) throws IOException {
		
		Employee[] emp=new Employee[3];
		
		System.out.println("Enter Worker Details ");
		
		for(int i=0;i<3;i++)
		{
		  emp[i]=new Employee();
			emp[i].setData();
		}
		System.out.println("Final Details...");
		
		for(int i=0;i<3;i++)
		{
			emp[i].showData();
		}
				
	}

}

