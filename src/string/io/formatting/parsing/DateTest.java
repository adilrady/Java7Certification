package string.io.formatting.parsing;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class DateTest
{

	public static void main(final String[] args)
	{
		final Date d = new Date();
		System.out.println("Date.toGMTString() : " + d.toGMTString());
		System.out.println("Date.toLocaleString() : " + d.toLocaleString());
		System.out.println("Date.toString() : " + d.toString());

		final DateFormat df = new SimpleDateFormat("d MMMM yyyy", Locale.FRANCE);
		System.out.println(df.format(d));

		final Locale locale = new Locale("en", "US");
		final DateFormat df2 = new SimpleDateFormat("d MMMM yyyy", locale);

		final Calendar calendar = Calendar.getInstance(Locale.CHINA);
		System.out.println("calendar.getTime() : " + (calendar.getFirstDayOfWeek() == Calendar.SUNDAY ? "TRUE" : "FALSE"));

		NumberFormatExample();
	}

	public static void NumberFormatExample()
	{
		System.out.println("------------ Number Format --------------");
		final float f1 = 123.4567f;
		final Locale locFR = new Locale("fr"); // France
		final NumberFormat[] nfa = new NumberFormat[4];

		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locFR);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(locFR);

		for (final NumberFormat nf : nfa)
		{
			System.out.println(nf.format(f1));
		}
	}
}
