package oop;

import java.util.Arrays;

class InvalidTimeException extends Exception {
	public InvalidTimeException(String message) {
		super(message);
	}
}

class Time implements Comparable<Time> {
	private int h, m, s;

	public Time(int h, int m, int s) throws InvalidTimeException {
		if (h >= 0 && h <= 23)
			this.h = h;
		else
			throw new InvalidTimeException("Invalid hour!");

		this.m = m;
		if (m >= 0 && m <= 59)
			this.m = m;
		else
			throw new InvalidTimeException("Invalid minutes!");

		if (s >= 0 && s <= 59)
			this.s = s;
		else
			throw new InvalidTimeException("Invalid seconds!");
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", this.h, this.m, this.s);
	}

	public int totalSeconds() {
		return this.h * 3600 + this.m * 60 + this.s;
	}

	@Override
	public int compareTo(Time other) {
		return this.totalSeconds() - other.totalSeconds();
	}
}

public class TestTime {
	public static void main(String[] args) {
		try {
			Time[] times = { new Time(1, 1, 1), 
					         new Time(10, 20, 30), 
					         new Time(1, 5, 10), 
					         new Time(20, 20, 20),
					         new Time(30, 10, 10) }; 

			Arrays.sort(times); // uses compareTo()

			for (Time t : times)
				System.out.println(t); // t.toString()
		} catch (InvalidTimeException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
