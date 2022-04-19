import java.util.*;
class Problem_2_ArrayCopy
{
	public void copying(int n,int[] arr)
	{
		int[] newArray=new int[n];
		for(int j=0;j<n;j++)
		{
			newArray[j]=arr[j];
		}
		System.out.print("Copy of the given array: ");
		for(int k=0;k<n;k++)
		{
			System.out.print(newArray[k]+" ");
		}
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
		System.out.print("Given array: ");
		for(int e=0;e<n;e++)
		{
			System.out.print(arr[e]+" ");
		}
		System.out.print("\n");
		Problem_2_ArrayCopy c=new Problem_2_ArrayCopy();
		c.copying(n,arr);
	}
}
