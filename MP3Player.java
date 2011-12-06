public class MP3Player {

	static boolean isLeapYear(int year) {
		/* Liefert true, wenn year ein Schaltjahr ist */
		return (year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0)));
	}

	static int year(int days) {
		// days = Tage, die seit 1. Jaenner 1980 vergangen sind.

		int year = 1980;

		
		while ( days > 366 || (!isLeapYear(year) && days > 365)) {
		// sollte logisch äquivalent sein zu deiner Lösung:
		// while (days > 365 && (!isLeapYear(year) || days > 366)) {
		// und ist meiner Ansicht nach einfacher zu verstehen:
		// entweder das aktuelle year ist ein Schaltjahr und es reichen daher days > 365,
		// um ein neues Jahr anzufangen
		// oder es sind noch mehr als 366 Tage, die reichen auf jeden Fall für ein neues Jahr
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
