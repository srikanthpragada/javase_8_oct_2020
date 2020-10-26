package lib1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);

		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat tf = DateFormat.getTimeInstance(DateFormat.LONG);
		System.out.println(df.format(d));
		System.out.println(tf.format(d));

		SimpleDateFormat sdf = new SimpleDateFormat("d-M-yyyy HH:mm:ss");
		System.out.println(sdf.format(d));

	}

}
