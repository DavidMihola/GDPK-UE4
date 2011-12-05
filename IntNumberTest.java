import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class IntNumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<IntNumber> list = new LinkedList<IntNumber>();
		while(sc.hasNextInt()) {
			list.add(new IntNumber(sc.nextInt()));
			// oder sollte das auch ohne "new IntNumber()" funktionieren?
		}

		java.util.Collections.sort(list);
		for (IntNumber i : list)
			System.out.println(i.get());
	}
}
