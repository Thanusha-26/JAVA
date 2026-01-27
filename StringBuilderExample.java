class StringBuilderExample
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("programming");
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());
		sb.ensureCapacity(120);
		sb.append("programmingprogrammin");
		System.out.println(sb.capacity());

	}
}