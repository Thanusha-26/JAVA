class StringBufferExample
{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("Hello");
		System.out.println(s);
		System.out.println(s.append("java"));
		System.out.println(s.insert(5,"Hi"));
		System.out.println(s.delete(5,7));
		System.out.println(s.replace(0,4,"programming"));
		System.out.println(s.reverse());
	}
}