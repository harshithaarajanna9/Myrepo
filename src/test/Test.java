package test;

public class Test {
public static void main(String[] args)
{
 int fib = 10;
 int[] fibo = new int[fib];
 fibo[0]=0;
 fibo[1]=1;
 for(int i=2;i < fib;i++)
 {
	 fibo[i]=fibo[i-1]+fibo[i-2];
	 
 }
  for(int i=0;i <fib;i++)
	  System.out.print(fibo[i] + " ");
}

}
