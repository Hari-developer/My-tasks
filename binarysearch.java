
public class binarysearch {

	 static int BinarySearch(int a[],int low,int high,int val)
	 {
		 if(low<=high) {
			 
	
		 int mid;
		 
		 mid=(low+high)/2;
		 
		 if(a[mid]==val)
		 {
			 return mid+1;
		 }
		 else if(a[mid]>val)
		 {
			 return BinarySearch(a,low,mid-1,val);
		 }
		 else
		 {
			 return BinarySearch(a,mid+1,high,val);
		 }
	 }
		return -1;
		 
	 }

	 public static void main(String args[])
	 {
		 int a[]= {23,56,44,27,90,71};
        int val=71;
        		
        int n=a.length;
        int res=BinarySearch(a,0,n+1,val);
        
        
        if(res==-1)
        {
        	System.out.println("Element not found");
        }
        else
        {
        	System.out.println("Element found from length  of"+" "+res+" "+" from an array");
        }
	 }
}
