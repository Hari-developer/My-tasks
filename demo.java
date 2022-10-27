package sow;
class sample
{
	int Amount=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw");
		if(this.Amount<amount)
		{
			System.out.println("Less balance....");
			try {
				wait();
				}
			catch(Exception e)
			{
				
			}
			}
		else  if(this.Amount<0)
	  {
		
	System.out.println("Amount is low....");
	}
	  else
		{
		  System.out.println("Sucess fully wihdraw....");
	      
			this.Amount-=amount;
			System.out.println(this.Amount);
		}
	}	
	
	synchronized  void deposit(int amount)
	{
		System.out.println("Going to deposite");
	     this. Amount+=amount;
	     System.out.println("Deposite comlete");
	     System.out.println(this.Amount);
	      notify();
    }
    }

public class demo {
public static void main(String args[])
{
	sample t=new sample();
	
	new Thread() {
	
		public void run()
		{
			t.withdraw(1500);
			
		}
		
		}.start();
		
		new Thread() {
			public void run()
			{
				t.deposit(10000);
			}
		}.start();
}
}

