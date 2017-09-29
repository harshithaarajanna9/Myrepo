package test;

public class Practice {
	Practice pract;
	private Practice()
	{
		
	}
	
	public Practice getReference(){
		if(pract == null){
			return new Practice();
		}else
		{
			return pract;
		}
	}
	public static void main(String[] args)
	{
		
		int i;
		for(i=0;i<100;i++){
			if(i%3==0 && i%5==0)
			{
				System.out.println("fizz");
			}
			else if (i % 5 ==0)
			{
				System.out.println("buzz");
			}
			else if(i % 3==0)
			{
				System.out.println("guru");
			}
			else
				System.out.println(i);
		}
	}
	

}
