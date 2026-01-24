import java.util.*;
class Duplicate
{
	public static void main(String args[])
	{
		int i,j,n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int a[] = new int [n];
		for(i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			boolean isDuplicate = false;
			for(j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
				isDuplicate = true;
				break;
				}
			}
		if(!isDuplicate)
		System.out.print(a[i]+" ");
		}
	}
}