package string.io.formatting.parsing;

import java.util.Scanner;


class ScanNext
{
	public static void main(final String[] args)
	{
		boolean b2, b;
		int i;
		String s, hits = " ";
		final Scanner s1 = new Scanner("1 true 34 hi");
		final Scanner s2 = new Scanner("1 true 34 hi");
		while (b = s1.hasNext())
		{
			s = s1.next();
			hits += "s";
		}
		while (b = s2.hasNext())
		{
			if (s2.hasNextInt())
			{
				i = s2.nextInt();
				hits += "i";
			}
			else if (s2.hasNextBoolean())
			{
				b2 = s2.nextBoolean();
				hits += "b";
			}
			else
			{
				s2.next();
				hits += "s2";
			}
		}
		System.out.println("hits " + hits);
	}
}
