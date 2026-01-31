public class AnagramCheck
{
	public static void main(String[] args)
	{
		String s1 = "ACT";
		String s2 = "TAC";
		if(isAangram(s1,s2))
		System.out.println("The given string is a Aangram");
		else
		System.out.println("The given string is not a Aangram");
	}
	public static boolean isAangram(String s1,String s2)
	{
		// Remove case difference
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		// Length Check
		if(s1.length()!=s2.length())
		return false;

		int count[] = new int[26]; // for a-z
		
		// count characters for first string
		for(int i=0;i<s1.length();i++)
		{
			count[s1.charAt(i)-'a']++;	
		}

		// reduce count using second string
		for(int i=0;i<s2.length();i++)
		{
			count[s2.charAt(i)-'a']--;	
		}

		// check all counts are zero
		for(int i=0;i<26;i++)
		{
			if(count[i]!=0)
			return false;
		}
		return true;
	}
}