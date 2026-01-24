import java.util.*;
class ArrayMaxMin
{
	public static void main(String args[])
	{
		int i,n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int a[] = new int [n];
		for(i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		int max = a[0];
		int min = a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}			
		}

		System.out.println(max);
		System.out.println(min);
	}
}