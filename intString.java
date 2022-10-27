import java.util.Scanner;

public class intString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	 int num =sc.nextInt();
	
	int a=num%10;//last digit
	int b=num/10;
	int c=b%10;//middle digit
	int d=num/100;//first digit
	
	
	String ut[] = {" ","one","two","three","four","five","six","Seven","eight","nine","ten","elven","twel","Thirty","Fourteen",
			           "Fifteen","sixteen","seventeen","eighteen","nineteen"};
	
	String at[]= {" ","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	
	String hu="Hundread";
	
	if(num<0 || num>999)
	{
		System.out.println("Invalid......");
	}
	else
	{
		if(num<20)
		{
			System.out.println(ut[num]);
		}
		else if(num==100)
		{
			System.out.println(hu);
		}
		else if(num<100)
		{
			System.out.println(at[c]+" "+ut[a]);
		}
		else
		{
			System.out.println(ut[d]+" "+" "+hu+" "+at[c]+" "+ut[a]);
		}
		
	}
	

	}

	}


