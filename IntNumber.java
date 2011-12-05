public class IntNumber implements Comparable<IntNumber> {
	private int value;

	public IntNumber(int initValue) {
		value = initValue;
	}

	public int get() {
		return value;
	}

	public int compareTo(IntNumber other) {
		return (this.value - other.get());
	}
}
