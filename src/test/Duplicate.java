package test;

public class Duplicate 
{

	public static void main(String[] args)
	{
	int[] arr = {77,54,67,33,2,2,1};
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i] == arr[j])
			{
				System.out.println(arr[i]);
				
			}
		}
	}
}
}


	


