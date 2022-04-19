import java.util.*;
class Problem_4_Duplicate
{	
	public void duplicateEle(int n,int[] arr)
	{
		boolean arr1[]=new boolean[n];
		Arrays.fill(arr1,false);
		System.out.println("Dupicate elements are:");
		for(int j=0;j<n;j++)
		{
			if(arr1[j]==true)
				continue;
			int c=1;
			for(int k=j+1;k<n;k++)
			{
				if(arr[j]==arr[k])
				{
					arr1[k]=true;
					c++;
				}
			}
			if(c>1)
				System.out.println(arr[j]);
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
		Problem_4_Duplicate d=new Problem_4_Duplicate();
		d.duplicateEle(n,arr);
	}
}
