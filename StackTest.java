public class StackTest {

	public static void main(String[] args) {

		Stack stack = new Stack(10);
	
		stack.push(1);
		stack.push(2);
		stack.push(3);

		for(int i : stack) { // Weil stack eine Instanz von Iterable<Integer> ist
			System.out.print(i); // Ausgabe: "123"
		}

	}
}
