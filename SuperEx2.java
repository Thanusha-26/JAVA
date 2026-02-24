class A
{
	int a;
	int b=100;
	A(int a)
	{
		this.a=a;
	}
	public void show()
	{
		System.out.println("Parent Class Method");
	}
}
class B extends A
{
	int a;
	B(int a,int b)
	{
		super(a);  // optional if not mentioned automatically parent constructor is called
		this.a=b;
	}
	public void show()
	{
		super.show();
		System.out.println(a);
		System.out.println(b);
		System.out.println(super.a);
	}
}
class SuperEx2
{
	public static void main(String[] args)
	{
		B ob=new B(2,3);
		ob.show();
	}
}