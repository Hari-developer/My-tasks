import java.util.*;
public class sample {
	public static void main(String[] args)
	{
		int a[]= {1,4,6,1,9,2,};
		int b[]= {3,1,2,77,11,4,83,26};
		int c[]= {23,545,65,13,4,};
		 
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				for(int k=0;k<c.length;k++) {
					if(a[i]==b[j]&&a[i]==c[k])
					{
						System.out.print(a[i]);
					}
				}
			}
		}
		
	}

}
