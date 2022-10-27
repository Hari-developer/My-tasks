import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the row");
		int num1=sc.nextInt();
		System.out.println("Enetr the coloum");
		int num2=sc.nextInt();
		
		int[] [] array=new int [num1][num2];
		
		
		for(int i=0;i<num1;i++)
		
			for(int j=0;j<num2;j++)
				
			
				array[i][j]=sc.nextInt();
			
		
		for(int i=0;i<num1;i++)
		{
			for(int j=0;j<num2;j++)
			{
				System.out.println(+array[i][j] +" ");
			}
		}
		
	}

}
