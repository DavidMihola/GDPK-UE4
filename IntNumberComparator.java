import java.util.Comparator;

public class IntNumberComparator implements Comparator<IntNumber> {

	public int compare(IntNumber a, IntNumber b) {
		return b.compareTo(a);
	}
}
