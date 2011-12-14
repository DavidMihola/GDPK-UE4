#
# Das Makefile sollte die Dateien aneinanderhängen und so die
# Datei für die Abgabe erzeugen
#
# Die Frage ist: Wie kriegt man die Zwischenüberschriften und so
# hinein?

# Aufgabe 1:
# Verschiebbar.java
# Skalierbar.java
# Linie.java
# Punkt.java
# Scheibe.java

# Aufgabe 2:
# Person.java
# Mann.java
# Frau.java
# Kind.java
# Begruessung.java

all: Abgabe.txt

%.txt: %.java
	/bin/echo "# $<:" | cat - "$<" > "$@"

Aufgabe1.txt: MP3Player.txt
	/bin/echo -e "\n1 Zusicherungen, Non-Termination\n" | cat - $+ > "$@"

Aufgabe2.txt: Stack.txt
	/bin/echo -e "\n2 Generischer Array-Stack\n" | cat - $+ > "$@"

Aufgabe3.txt: IntNumber.txt IntNumberComparator.txt
	/bin/echo -e "\n3 Comparable und Comparator\n" | cat - $+ > "$@"

Abgabe.txt: Aufgabe1.txt Aufgabe2.txt Aufgabe3.txt
	/bin/echo -e "VU Grundlaged der Programmkonstruktion\n4. Übung\n\nbearbeitet von:\nDavid Mihola, 9902433\nFlorian Mihola, 0304850\n" | cat - $+ > "$@"

clean:
	rm -f *.txt
