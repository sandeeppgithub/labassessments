class SmallestEx1
{
	static int getSecondSmallest(int [] arr)
	{
		int low1=Integer.MAX_VALUE;
		int low2=Integer.MAX_VALUE;

		for (int i=0;i<arr.length ;i++ )
		{
			if (arr[i]<low1)
			{
				low2=low1;
				low1=arr[i];
			}
			else if (arr[i]<low2 && arr[i]!=low1)
			{
				low2=arr[i];
			}
		}

			return low2;
	}
		
	public static void main(String[] args) 
	{
		        int arr[] = {50,55,25};
				int result =getSecondSmallest(arr);
				System.out.println("Second smallest array "+result);
	}
}