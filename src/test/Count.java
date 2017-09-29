package test;

public class Count {

	public static void main(String[] args)
	{
		int sum = 0, nu = 2,count =0;
		while(count < 1000)
		{
			if(isPrime(nu)){
				sum = sum + nu;
				count++;
			}
			
		}
	    nu++;
	    System.out.print(sum);
	}
	 private static boolean isPrime(int nu)
	 {
		 for(int i=2;i<=nu/2 ;i++)
		 {
			 if(nu % i == 0)
			 {
				 return false;
				
			 }
		 }
		 return true;
	 }
	 
	
}

	
