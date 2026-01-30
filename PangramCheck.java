public class PangramCheck
{
	public static void main(String[] args)
	{
		String str = "The quick brown fox jumps over the lazy dog";

		if(isPangram(str))
		System.out.println("The given string is a Pangram");
		else
		System.out.println("The given string is not a Pangram");
	}
	public static boolean isPangram(String str)
	{
		boolean letters[] = new boolean[26]; // for A-Z
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z')
			letters[ch-'A'] = true;
			else if(ch>='a' && ch<='z')
			letters[ch-'a'] = true;
		}
		for(boolean present:letters)
		{
			if(!present) 
			return false;
		}
		return true;
	} 
}