package ep;

import java.util.Scanner;

public class Ebill implements elec {
	int amount;
	public void union( int unit) {
		if(unit<100) {
			amount=unit*2;
			System.out.println(amount);
		}else if(unit<300){
			  amount = 100 *2+ (unit - 100) * 3;  
			  System.out.println(amount);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Enter the unit");
Scanner sc=new Scanner(System.in);
int unit=sc.nextInt();

 Ebill eb=new Ebill();
 eb.union(unit);
	}

}
