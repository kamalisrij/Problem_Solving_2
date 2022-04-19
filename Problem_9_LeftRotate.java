import java.util.*;
class Problem_9_LeftRotate
{
	public void left(int n,int lr,int[] arr)
	{
		System.out.println("After "+lr+" rotation");
		for(int j=0;j<lr;j++)
		{
			int first=arr[0];
			int k;
			for(k=0;k<n-1;k++){
				arr[k]=arr[k+1];
			}
			arr[k]=first;
		}
		for(int e=0;e<n;e++)
		{
			System.out.print(arr[e]+" ");
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
		System.out.println("Enter how many left rotation you need: ");
		int lr=in.nextInt();
		Problem_9_LeftRotate l=new Problem_9_LeftRotate ();
		l.left(n,lr,arr);
	}
}
