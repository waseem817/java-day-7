
import java.util.*;
class ReverseOfArray
{
	public static void main (String[] args) 
	{
	    Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
		int arr[]=new int[n];
        for(int i=0;i<n;i++)
	    
			arr[i]=sc.nextInt();
            int l=0;
            int h=n-1;
			while(l<=h)
            {
                int temp=arr[l];
                arr[l]=arr[h];
                arr[h]=temp;
                l++;
                h--;
            }
            
        
        System.out.println(Arrays.toString(arr));
        
    }
}            
   
