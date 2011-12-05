public class MP3PlayerTest {

	public static void main(String[] args) {

		int days = 366;
		int year = 1980;
		while (year < 2013) {
			days += MP3Player.isLeapYear(year) ? 366 : 356;			
			System.out.println("" + year + " ist " + (MP3Player.isLeapYear(year) ? "" : "k") + "ein Schaltjahr.");
			year++;
		}

		System.out.println("Rufe MP3Player.year(731) // 31. Dezember 1981, kein Schaltjahr");
		System.out.println("Ergebnis: " + MP3Player.year(731));

		System.out.println("Rufe MP3Player.year(366) // 31. Dezember 1980, ein Schaltjahr");
		System.out.println("Ergebnis: " + MP3Player.year(366));
	}
}
