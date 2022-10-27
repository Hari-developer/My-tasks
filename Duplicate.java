
public class Duplicate {

	public static void main(String[] args) {
		int arr[]= {2,445,6,2,13,4,6};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					
					
					System.out.println("Duplicates are     :"+arr[i]);
					
				}

				
			}
			
		}
		
	}

}
