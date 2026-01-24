import java.util.*;
class SortArray
{
	public static void main(String args[])
	{
		int i,j,n,temp;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int a[] = new int [n];
		for(i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}


