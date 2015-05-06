package cs187.part1;

public class DateTester {
	public static void main(String[] args) {
		Date myDate = new Date(6, 24, 1951);
		IncDate aDate = new IncDate(1, 11, 2001);

		System.out.println("mydate day is:   " + myDate.getDay());
		System.out.println("aDate day is:    " + aDate.getDay());

		aDate.increment();

		System.out.println("the day after is: " + aDate.getDay());
	}
}
