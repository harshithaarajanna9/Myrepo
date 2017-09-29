package test;

public class Sunday {
	Sunday sun;
	private Sunday()
	{
		
	}
	public Sunday getReference(){
		if(sun == null)
		{
			return new Sunday();
		}
		else
		{
			return sun;
		}
	}
	public static void main(String[] arg)
	{
		String str = "gurus";
		char[] arr = str.toCharArray();
        String result = "";
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			result = result + arr[i];	
		}
		System.out.println(result);
	}
}
