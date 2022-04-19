import java.util.*;
class Problem_3_Freq
{
	public void freqCount(int n,int[] arr)
	{	boolean[] arr1=new boolean[n];
		Arrays.fill(arr1,false);
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
			System.out.println(arr[j]+" "+c);	
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
		Problem_3_Freq f=new Problem_3_Freq();
		f.freqCount(n,arr);
	}
}
