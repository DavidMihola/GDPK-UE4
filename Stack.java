import java.util.Iterator;
import java.util.ArrayList;

// DAVID: Problem hier: Das Skriptum sagt: "Beispielsweise können wir keine Instanz
// eines Typparameters erzeugen und kein Array anlegen, das Instanzen eines
// Typparameters enthält.

// Diskussion z. B. hier: http://stackoverflow.com/questions/529085/java-how-to-generic-array-creation
// Statt Array einfach eine Liste nehmen?


public class Stack<T> implements Iterable<T> {
	private ArrayList<T> array;
	private int pointer; // Index des ersten freien Feldes

	public Stack(int maxCapacity) {
		this.array = new ArrayList<T>(maxCapacity);
		this.pointer = 0;
	}

	public void push(T value) { array.add(pointer++, value); }

	public T pop() { return array.get(--pointer); }
	
	public Iterator<T> iterator() { return new StackIterator(); }

	// Als innere Klasse, damit auf die private-Objektvariablen der
	// Eltern-Klasse zugegriffen werden kann
	private class StackIterator implements Iterator<T> {
		int index;

		StackIterator() { index = 0; }
	
		public boolean hasNext() { return index < pointer; }
	
		public T next() { return array.get(index++); }
	
		public void remove() {
			// Optionale Methode, wird hier nicht unterstuetzt.
			throw new UnsupportedOperationException();
		}
	}
}

