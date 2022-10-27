  class demo extends Thread
  {

	public  void run()

  {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(Math.abs(c));
  }
	}
  class demo1 extends Thread
  {
	public  void run()

  {	int a=10;
	int b=20;
	
	int c=a*b;
	System.out.println(c);
		  
  }
	
  }
  class demo2 extends Thread
  {
	public  void run()

  {
		int a=10;
		int b=20;
		
		int c=a+b;
		System.out.println(c);
  }
	
  }


	  
  
public class ko
{

	
	public static void main(String[] args) {
		demo t1=new demo();
		demo1 t2=new demo1();
		demo2 t3=new demo2();
		
		t1.setPriority(6);
		t2.setPriority(7);
		t3.setPriority(2);
		
	System.out.println(demo1.activeCount());	
		t1.start();
		
		t2.start();
		
		t3.start();
	
	}

}
