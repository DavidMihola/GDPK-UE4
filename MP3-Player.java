public class MP3-Player {

	static boolean isLeapYear(int year) { /* Liefert true, wenn year ein Schaltjahr ist */ }

	static int year(int days) {
		// days = Tage, die seit 1. Jaenner 1980 vergangen sind.

		int year = 1980;

		while (days > 365) {
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
