
public class BubbleSort {
	public static void main(String args[])
	{
		int arr[]= {4,5,2,7,1,0,8,3};
	
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		
		
		}

      }

