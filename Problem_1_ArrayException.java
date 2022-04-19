class Problem_1_ArrayException
{
	public static void main(String args[])
	{
		int [] arr=null;
		int size=5;
		int ind=-1;
		int op;
		for(int i=0;i<6;i++)
		{
		try
		{	
			switch(i)
			{
				case 0:
					op=arr[0];		
					break;
				case 1:
					arr=new int[ind];
					op=arr[ind];		
					break;
				case 2:
					arr=new int[size];		
					op=arr[size];
					break;
				case 3:
					arr=new int[6];
					op=arr[6];
					break;
				case 4:
					Object a=new Integer(0);
					System.out.println((String)a);
					break;
				case 5:
					Object x[]=new String[5];
					x[0]=new Integer(0);
					System.out.println(x);
					break;
			}
		}
	
		catch(NullPointerException e1)
		{
			System.out.println("Exception: "+e1.getMessage());
			
		}
		catch(NegativeArraySizeException e2)
		{
			System.out.println("Exception: "+e2.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e3)
		{
			System.out.println("Exception: "+e3.getMessage());
		}
		catch(IndexOutOfBoundsException e4)
		{
			System.out.println("Exception: "+e4.getMessage());
		}
		catch(ClassCastException e5)
		{
			System.out.println("Exception: "+e5.getMessage());
		}
		catch(ArrayStoreException e6)
		{
			System.out.println("Exception: "+e6.getMessage());

		}
	}
}
}
