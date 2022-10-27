import java.util.Scanner;

public class gear {
	String yes="yes";
 void gear1()
	{
		System.out.println("speed is 0 t0 30");
		 Scanner sc=new Scanner(System.in);
		System.out.println("If you want to break");
		String speed=sc.nextLine();
	
		if( yes==speed)
		{
			System.out.println("Stop");
		}
		
	        
		
	}
	void gear2()
	
	{
		System.out.println("speed is 30 to 50 ");
		 Scanner sc=new Scanner(System.in);
			System.out.println("If you want to break");
			String speed=sc.nextLine();
		
			if( speed=="yes")
			{
				
				System.out.println("Changed......");
				gear1();
			}
	}
	void gear3()
	{
		System.out.println("speed is 50 to 100");
		 Scanner sc=new Scanner(System.in);
			System.out.println("If you want to break");
			String speed=sc.nextLine();
		
			if( yes==speed)
			{
				gear2();			}
         	}
	
	
	public static void main(String[] args) {
		
	
		gear s=new gear();
		
		s.gear1();
	}

}
