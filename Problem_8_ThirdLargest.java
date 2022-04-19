import java.util.*;
class Problem_8_ThirdLargest
{
	public void large(int n,int[] arr)
	{
		int temp;
		for(int j=0;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(arr[j]>arr[k])
				{
					temp=arr[k];
					arr[k]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Third largest number is: "+arr[n-3]);
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
		Problem_8_ThirdLargest l=new Problem_8_ThirdLargest();
		l.large(n,arr);
	}
}
