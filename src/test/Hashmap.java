package test;

import java.util.HashMap;

public class Hashmap {
public static void main(String[] args)
{
	String str = "JAVA";
	int i;
	char[] arr = str.toCharArray();
	HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
	for(i=0;i<=arr.length-1;i++)
	{
		if(hmap.containsKey(arr[i]))
				{
					int var = hmap.get(arr[i]);
					var ++;
					hmap.put(arr[i],var);
				}
		else
			hmap.put(arr[i],1);
	}
	for(int j=0;j<arr.length-1;j++)
	{
		if(hmap.get(arr[j]).intValue() == 1)
		{
			System.out.println(arr[j]);
			break;
		}
		
		}
	}
}

