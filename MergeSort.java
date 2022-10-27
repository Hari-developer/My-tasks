import java.util.Arrays;

public class  MergeSort
{
	static  void arraystore(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String args[])
	{
		int a[]= {1,15,28,30,12,11};
		mergeSort(a,0,a.length-1);
		
	    arraystore(a);
	}
	public static void mergeSort(int[] a, int beg, int end) {
	    if (beg<=end) return;

	    int mid = (beg+end)/2;
	    mergeSort(a, beg, mid);
	    mergeSort(a, mid+1, end);
	    merge(a, beg, mid, end);
	}

static void merge(int a[], int beg, int mid, int end)    
{    
    int i, j, k;  
    int n1 = mid - beg + 1;    
    int n2 = end - mid;    
      
    int LeftArray[]=new int[n1];    
    int RightArray[]=new int[n2];    
    
    for ( i = 0; i <n1-1; i++)    
    LeftArray[i] = a[beg + i];    
    for ( j = 0; j <n2-1; j++)    
    RightArray[j] = a[mid + 1 + j];    
      
    i = 0;
    j = 0;  
    k = beg;  
      
    while (i < n1 && j < n2)    
    {    
        if(LeftArray[i] <= RightArray[j])    
        {    
            a[k] = LeftArray[i];    
            i++;    
        }    
        else    
        {    
            a[k] = RightArray[j];    
            j++;    
        }    
        k++;    
    }    
    while (i<n1)    
    {    
        a[k] = LeftArray[i];    
        i++;    
        k++;    
    }    
      
    while (j<n2)    
    {    
        a[k] = RightArray[j];    
        j++;    
        k++;    
    }  
 
}    
}