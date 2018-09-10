import java.util.Scanner;
public class Primes
{
	public static void main(String args [])
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int copy=num;
		boolean pPrime=false;
		boolean mPrime=false;
		while(!pPrime)
		{
			num++;
			pPrime=isPrime(num);
		}
		System.out.println("Closest prime number going forward: "+num);
		while(!mPrime)
		{
			copy--;
			mPrime=isPrime(copy);
		}
		System.out.println("Closest prime number going backwards: "+copy);
	}
	
	public static boolean isPrime(int num)
	{
		for(int divisor=2;divisor<=num/2;divisor++)
		{
			if(num%divisor==0)
			{
				return false;
			}
		}
		return true;
	}
}