public class MP3Player {

	static boolean isLeapYear(int year) {
		/* Liefert true, wenn year ein Schaltjahr ist */
		return (year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0)));
	}

	static int year(int days) {
		// days = Tage, die seit 1. Jaenner 1980 vergangen sind.

		int year = 1980;

		while (days > 365 && (!isLeapYear(year) || days > 366)) {
			if (isLeapYear(year)) {
				if (days > 366) {
					days -= 366;
					year += 1;
				}
			} else {
				days -= 365;
				year += 1;
			}
		}

		return year;
	}

}
