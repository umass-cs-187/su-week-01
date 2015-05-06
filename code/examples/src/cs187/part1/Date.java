package cs187.part1;

public class Date {
	protected int year;
	protected int month;
	protected int day;
	public static final int MINYEAR = 1583;

	// Constructor
	public Date(int newMonth, int newDay, int newYear) {
		month = newMonth;
		day = newDay;
		year = newYear;
	}

	// Observers
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int lilian() {
		// Returns the Lilian Day Number
		// of this date.
		// Algorithm goes here.
		
		// Return -1 to satisfy compiler:
		return -1;
	}

	public String toString()
	// Returns this date as a String.
	{
		return (month + "/" + day + "/" + year);
	}
}
