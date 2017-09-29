package test;

public class Day {
public static void main(String[] args){
	char ch;
	String str = "JAVA hdjdfj 1231";
	int j;
	for(ch = 'A';ch<='Z';ch++)
	{
		int count=0;
		for( j=0;j<str.length();j++)
		{
			if(str.charAt(j)== ch)
				count++;
		}
		System.out.println(ch +" "+ count);
	}
	
}
}
