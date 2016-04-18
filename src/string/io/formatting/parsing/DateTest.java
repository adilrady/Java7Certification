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
		formatDateTimeUsingPattern("EEEEE MMMMM yyyy HH:mm:ss.SSSZ");
		test();
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
	
	public static void formatDateTimeUsingPattern(String pattern){
		System.out.println("------------ Date Time Formatting ------------");
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		String dateTime = formatter.format(new Date());
		System.out.println("Pattern : "+pattern+"\nResult  : "+dateTime);
	}
	
	public static void test(){
		System.out.println("-------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
	    Calendar cal = Calendar.getInstance();
	    Date date=cal.getTime();
	    String[] days = new String[6];
	    days[0]=sdf.format(date);
	    
	    for(int i = 5; i >= 0; i--){
	        cal.add(Calendar.DAY_OF_MONTH,-1);
	           date=cal.getTime();
	           days[i]=sdf.format(date);
	    }

	    for(String x: days){
	        System.out.println(x);
	    }
	}
}
