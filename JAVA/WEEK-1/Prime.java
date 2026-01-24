import java.util.*;
class Prime
{
	public static void main(String [] args)
	{
	int i,n,j,c;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(i=1;i<=n;i++)
	{
	c=0;
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
			c=c+1;
		}
	if(c==2)
	System.out.print(i+" ");
	}
	}
}