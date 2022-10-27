
public class diamond {
        
	public static void Diamond(int num)
	{
		for(int i=1;i<2*num;i++)
		{
			int totalcolsInrow=i>num?2*num-i:i;
			int space=num-totalcolsInrow;
			for(int k=0;k<space;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<totalcolsInrow;j++)
			{
				System.out.print("*"+" ");
			}
			
		System.out.println();
		}
	}
	public static void main(String[] args) {

		Diamond(5);

	}

}
