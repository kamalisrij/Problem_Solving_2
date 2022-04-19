import java.util.*;
class Problem_7_Largest
{
	public void large(int n,int[] arr)
	{
		int max=arr[0];
		for(int j=0;j<n;j++)
		{
			if(max<arr[j])
				max=arr[j];
		}
		System.out.println("Largest element is: "+max);
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
		Problem_7_Largest l=new Problem_7_Largest();
		l.large(n,arr);
	}
}
