package lib1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NewDateDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate start = LocalDate.of(2020, 1, 1);
		
		System.out.println(start);
		System.out.println(today);
		
		long days = ChronoUnit.DAYS.between(start,today);
		System.out.println(days);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-uuuu H:mm:ss");
		System.out.println(df.format(LocalDateTime.now()));
	}

}
