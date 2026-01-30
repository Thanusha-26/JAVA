public class MostFrequentChar
{
	public static void main(String[] args)
	{
		String str = "programming";

		int freq[] = new int[256]; //ASCII SIZE
		
		// count frequency
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			freq[ch]++;
		}
		
		// Find maximum occurring character
		char maxChar = ' ';
		int maxCount = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(freq[ch] > maxCount)
			{
				maxCount = freq[ch];
				maxChar = ch;
			}
		}
		System.out.println(maxChar+" "+maxCount);
	}
}