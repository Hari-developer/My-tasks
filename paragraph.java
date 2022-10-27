
public class paragraph {

	public static void main(String[] args) 
	{
		String par="teleapps is nice company teleapps is a growing "
				+ " company";
		String[] b=par.split("is");
		int count=0;
		for(int i=0;i<b.length-1;i++)
		{
			
			 count++;
			
		}
		 System.out.println(count);
		
	}	
	
}
