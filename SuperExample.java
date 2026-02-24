class A
{
	int a=100;
	int b=200;
}
class B extends A
{
	public void show()
	{
		int a=50;
		System.out.println(a);
		System.out.println(b);
		System.out.println(super.a);
	}
}
class SuperExample
{
	public static void main(String[] args)
	{
		B b=new B();
		b.show();
	}
}