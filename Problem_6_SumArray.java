import java.util.*;
class Problem_6_SumArray
{
	public void sum(int n,int[] arr)
	{
		int s1=0;
		for(int j:arr)
		{
			s1=s1+j;
		}
		System.out.println("Sum of the elements is: "+s1);
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		Problem_6_SumArray s=new Problem_6_SumArray();
		s.sum(n,arr);
	}
}
