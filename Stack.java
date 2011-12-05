import java.util.Iterator;

// DAVID: Problem hier: Das Skriptum sagt: "Beispielsweise können wir keine Instanz
// eines Typparameters erzeugen und kein Array anlegen, das Instanzen eines
// Typparameters enthält.

// Diskussion z. B. hier: http://stackoverflow.com/questions/529085/java-how-to-generic-array-creation
// Statt Array einfach eine Liste nehmen?


public class Stack implements Iterable<Integer> {
	private int[] array;
	private int pointer; // Index des ersten freien Feldes

	public Stack(int maxCapacity) {
		this.array = new int[maxCapacity];
		this.pointer = 0;
	}

	public void push(int value) { array[pointer++] = value; }

	public int pop() { return array[--pointer]; }
	
	public Iterator<Integer> iterator() { return new StackIterator(); }

	// Als innere Klasse, damit auf die private-Objektvariablen der
	// Eltern-Klasse zugegriffen werden kann
	private class StackIterator implements Iterator<Integer> {
		int index;

		StackIterator() { index = 0; }
	
		public boolean hasNext() { return index < pointer; }
	
		public Integer next() { return array[index++]; }
	
		public void remove() {
			// Optionale Methode, wird hier nicht unterstuetzt.
			throw new UnsupportedOperationException();
		}
	}
}

