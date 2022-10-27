import java.util.Arrays;
import java.util.*;

public class sortstrinarray {

	public static void main(String[] args) {
	
   Scanner sc =new Scanner(System.in);
    System.out.println("enter no of string--->");
    int num=sc.nextInt();
    
    String [ ] str=new String[num];
   int i;
    for( i=0;i<str.length;i++)
    {
    	str[i]=sc.next();
    }
   
   
	for( i=0;i<str.length;i++)
	{
		for(int j=i+1;j<str.length;j++)
		{
			if(str[i].compareTo(str[j])<0)
			{
			         String temp =str[i];
			         str[i]=str[j];
			         
			         str[j]=temp;
	 	}
		}
	
	}
	System.out.println(Arrays.toString(str));
	}
}


