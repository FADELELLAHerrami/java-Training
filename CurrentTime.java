package CurrentTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
	public static void main(String []args) {
		Date currentTime =new Date();
		System.out.println(currentTime);// ==> Wed Oct 19 18:46:45 CEST 2022
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeFormat.format(currentTime));// ==> 06:55:03
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:yy");
		System.out.println(dateFormat.format(currentTime));// ==> 19:10:22
		/* https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html */
		SimpleDateFormat dayInWeek=new SimpleDateFormat("EEEE");
		System.out.println(dayInWeek.format(currentTime));
	}
}
