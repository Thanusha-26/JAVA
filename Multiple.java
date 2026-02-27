interface A
{
	public void show();
}
interface B
{
	public void display();
}
class C implements A,B
{
	public void show()
	{
		System.out.println("Interface A");
	}
	public void display()
	{
		System.out.println("Interface B");
	}
}
class Multiple
{
	public static void main(String[] args)
	{
		C ob = new C();
		ob.show();
		ob.display();
	}
}