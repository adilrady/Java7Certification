package string.io.formatting.parsing;

import java.text.NumberFormat;


public class Slice
{
	public static void main(final String[] args)
	{
		final String s = "987.123456";
		final double d = 987.123455d;
		final NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(d) + " ");
		try
		{
			System.out.println(nf.parse(s));
		}
		catch (final Exception e)
		{
			System.out.println("got exc");
		}
	}
}
