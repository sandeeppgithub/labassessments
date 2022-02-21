import java.util.*;
class Revex3
{


	 static int [] getSorted(int[] arr)
	{
       int[] reverse= new int[arr.length];
	   int j=0;
	   for (int i= arr.length-1;i>=0 ;i-- )
	   {
		   reverse[j]=arr[i];
		   j++;
	   }
	   return reverse;
	}
	public static void main(String[] args)
	{
		int[] arr={10,20,30,40,50};
		int[] a = getSorted(arr);
		System.out.println("after reversing");

		for (int i=0;i<a.length ;i++ )
		{
			System.out.println(a[i]+" ");
		}
	}
}