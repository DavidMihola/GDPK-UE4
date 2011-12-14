public class MP3Player {

	static boolean isLeapYear(int year) {
		/* Liefert true, wenn year ein Schaltjahr ist */
		return (year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0)));
	}

	static int year(int days) {
		// days = Tage, die seit 1. Jaenner 1980 vergangen sind.

		int year = 1980;

		// Die Invariante soll sein: In jeder Interation ist der Wert in
		// olddays höher als der in days. Im weiteren Verlauf wird in olddays
		// immer der Wert gespeichert, den days im vorigen Schleifendurchlauf
		// hatte. Das heißt also, dass days mit jedem Durchlauf weniger werden
		// muss - damit ist die Termination sichergestellt.
		// Zu Beginn wird olddays künstlich auf einen Wert größer als days gesetzt:
		int olddays = days + 1;
		
		assert(days < olddays);

		// zum Vergleich die falsche Lösung:
		// while (days > 365) {

		while ( days > 366 || (!isLeapYear(year) && days > 365)) {
		// wenn days größer ist als 366, geht sich auf jeden Fall noch ein weiteres Jahr aus,
		// auch wenn es sich um ein Schaltjahr handelt;
		// wenn das aktuelle Jahr kein Schaltjahr ist, reichen auch days > 365,
		// um ein neues Jahr anzufangen

			assert(days < olddays);
			// nachdem das gesichert ist, wird der Wert von days für später nach olddays übertragen:
			olddays = days;
			// jetzt kann days geändert werden

			if (isLeapYear(year)) {
				if (days > 366) {
					days -= 366;
					year += 1;
				}
			} else {
				days -= 365;
				year += 1;
			}

			// am Ende der Schleife muss sich der Wert in days wiederum verringert haben:
			assert(days < olddays);
		}

		assert(days < olddays) && !( days > 366 || (!isLeapYear(year) && days > 365));

		return year;
	}

}
