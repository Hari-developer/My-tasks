package sow;

import java.util.Scanner;

public class atm {
	 static int Bankbalance=10000;
	
	static void operation(int amt) {
	int	minamount=1000;
	if(amt>minamount) {
		if(amt<=Bankbalance) {
			amt=Bankbalance-amt;
			  System.out.println("remaining amount"+  amt);
			  System.out.println("Thank you");
			
		}
		else {
			System.out.println(" your bank balance is low");
		}
	}
	      else {
			System.out.println("the amount is too low do not use the fastcash");
	      }	}
	
		
	  static void operation() {
		  System.out.println("Enter the amount");
		  Scanner sc=new Scanner(System.in);
		  int amt=sc.nextInt();
		if(amt>100) {
			if(amt<Bankbalance) {
		
			amt=Bankbalance-amt;
			  System.out.println("remaining amount"+  amt);
			  System.out.println("Thank you");
			}
			
		else {
			System.out.println(" your bank balance is low");
		}}
		else {
			System.out.println("the amount is too low do not use the Withdraw");
		}
	}


	public static void main(String[] args) {
	
	System.out.println("Welcome");
	System.out.println("Insert your card");
	System.out.println("choose your language");
	Scanner s=new Scanner (System.in);
	String lang=s.nextLine();
	switch(lang) {
	  case"English":
	    System.out.println( "your language is English");
	    break;
	  case "Tamil":
		  System.out.println("your language is Tamil");
		  break;
	}
	int pin=1234;
	if(1234==pin) {
	   System.out.println("choose your transcation :   \n 1. Fastcash  \n 2.Withdraw ");
	   int option=s.nextInt();
	 
	   if(option==1) {
		   System.out.println("Enter the amount");
		   int amt=s.nextInt();
		  operation( amt);
		
		    
		   
	   }
	   if(option==2) {
		   
		   operation();
	   }
	}
	else {
		System.out.println("Invalid pin");
		
		
	}
	}

}
