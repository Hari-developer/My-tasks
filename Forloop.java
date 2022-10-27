
public class Forloop {

	public static void main(String[] args) {
		int num=5;


		for(int i=1;i<=2*num;i++)
		{
			int total=i>num?2*num-i:i;
			int space=num-total;
				for(int s=0;s<space;s++)
					{
						System.out.print(" ");
				}
					 
			for(int j=1;j<=total;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		}

}
