import java.util.*;
class Problem_5_Reverse
{
	public void reversedArray(int n,int[] arr)
	{
		System.out.println("Reversed array:");
		for(int j=n-1;j>=0;j--)
			System.out.print(arr[j]+" ");
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
		Problem_5_Reverse r=new Problem_5_Reverse();
		r.reversedArray(n,arr);
	}
}
