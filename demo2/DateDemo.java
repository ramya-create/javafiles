package demo2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo {
	public static void main(String[] args) {
		//current date and time
		Date currentDate=new Date();
		System.out.println("current date and time: " + currentDate);
		
		//creating a date using milliseconds
		long milliseconds=1617971200000L; //represents April 10, 2021
		Date dateFromMilliseconds=new Date(milliseconds);
		System.out.println("Date from milliseconds: " + dateFromMilliseconds);
		
		//parsing a string to create a date
		String dateString = "2021-04-10";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date parseDate=sdf.parse(dateString);
			System.out.println("Parsed Date: " + parseDate);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		//formatting a date
		SimpleDateFormat sdf2=new SimpleDateFormat("EEEE. MMMM DD, YYYY 'at' hh:mm:ss a");
		String formattedDate=sdf2.format(currentDate);
		System.out.println("Formatted Date: " + formattedDate);
	}
}
